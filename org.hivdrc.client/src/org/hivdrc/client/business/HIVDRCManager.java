/*******************************************************************************
 * Copyright (c) 2010  Ola Spjuth <ola@bioclipse.net>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 ******************************************************************************/
package org.hivdrc.client.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bioclipse.core.ResourcePathTransformer;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.managers.business.IBioclipseManager;

import org.hivdrc.client.FixedLengthProteinSequenceValidator;
import org.hivdrc.client.HIVPredictionContants;
import org.hivdrc.client.views.HIVPredictionResultView;
import net.bioclipse.xws.JavaDOMTools;
import net.bioclipse.xws.client.adhoc.IFunction;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws.exceptions.XwsException;
import net.bioclipse.xws4j.business.IXwsManager;
import net.bioclipse.xws4j.exceptions.Xws4jException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.hivdrc.hivpred.DocumentRoot;
import org.hivdrc.hivpred.HIVPredInputType;
import org.hivdrc.hivpred.HIVPredOutputType;
import org.hivdrc.hivpred.HivpredFactory;
import org.hivdrc.hivpred.conversion.EMFDOMConversion;
import org.hivdrc.hivpredrt.HIVPredRTInputType;
import org.hivdrc.hivpredrt.HIVPredRTOutputType;
import org.hivdrc.hivpredrt.HivpredrtFactory;
import org.w3c.dom.Element;

/**
 * 
 * @author ola
 *
 */
public class HIVDRCManager implements IBioclipseManager {

    private static final Logger logger = Logger.getLogger(HIVDRCManager.class);

    /**
     * Gives a short one word name of the manager used as variable name when
     * scripting.
     */
    public String getManagerName() {
        return "hivdrc";
    }
    
    FixedLengthProteinSequenceValidator validatorPI;
    FixedLengthProteinSequenceValidator validatorNRTI;
    IXwsManager xmpp;

    public HIVDRCManager() {
      validatorPI=new FixedLengthProteinSequenceValidator(
                                   HIVPredictionContants.PROTEASE_EXACT_LENGTH);

      validatorNRTI=new FixedLengthProteinSequenceValidator(
                                   HIVPredictionContants.RT_EXACT_LENGTH);
      
      xmpp=net.bioclipse.xws4j.Activator.getDefault().getXwsManager();
    }

    /**
     * Predict on the default JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public HIVPredOutputType predictPI(String sequence) 
    throws Xws4jException, XmppException, InterruptedException {

      Map<String, HIVPredOutputType> map = predictPI(sequence, 
                                     HIVPredictionContants.DEFAULT_HIVPRED_JID);
      for (String s : map.keySet()){
        //Return first match
        return map.get(s);
      }
      //Should not happen
      return null;
      
    }

    /**
     * Invoke hivpred prediction on the specified JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public Map<String, HIVPredOutputType> predictPI(String sequence, 
                                                    String JID) 
                                                    throws Xws4jException, 
                                                    XmppException, 
                                                    InterruptedException {

      List<String> sequences=new ArrayList<String>();

      //Try to interpret as path
      try{
        IFile file=ResourcePathTransformer.getInstance().transform(sequence);
        if (file!=null){
          logger.debug("Reading sequences from file: " 
                       + file.getRawLocation().toOSString());

          //Read file line by line
          java.util.Scanner sc = new java.util.Scanner(file.getContents());
          int cnt=0;
          while ( sc.hasNextLine() ) {
            cnt++;
            String tmpSeq=sc.nextLine();
            String validationMessage=validatorPI.isValid(tmpSeq);
            if (validationMessage==null){
              logger.debug("Added line " + cnt + " as valid sequence: " 
                           + tmpSeq);
              sequences.add(tmpSeq);
            }
            else{
              logger.error("Line #" + cnt + ": " + tmpSeq +" invalid: " 
                           + validationMessage);
            }
          }
        }

      }
      catch (Exception e){
        //Parsing of file failed, try interpret as a single sequence string
        if (validatorPI.isValid(sequence)==null){
          //Valid!
          sequences.add(sequence);
        }

        if (sequences.size()<=0){
          throw new IllegalArgumentException("The input: '" + sequence + 
              "' could not be interpreted as a 99 aa sequence string " +
          "or a valid file path. ");
        }
      }

      return predictPI(sequences, JID);

    }

    /**
     * Predict array of sequences on default JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public Map<String, HIVPredOutputType> predictPI(List<String> sequences) 
    throws Xws4jException, XmppException, InterruptedException {
      return predictPI(sequences, HIVPredictionContants.DEFAULT_HIVPRED_JID);
    }


    /**
     * Invoke hivpred prediction on the specified JID for the sequences
       * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public Map<String, HIVPredOutputType> predictPI(List<String> sequences, 
                                                    String JID) 
                                                    throws Xws4jException, 
                                                    XmppException, 
                                                    InterruptedException {

      //Connect if not connected
      if (!(xmpp.isConnected()))
        xmpp.connect();

      IFunction hivFunction = xmpp.getFunction(JID, HIVPredictionContants.HIVPRED_NODE);

      Map<String, HIVPredOutputType> returnMap = 
          new HashMap<String, HIVPredOutputType>();
      int noErrors=0;
      
      HIVPredOutputType output=null;
      String lastsequence="";
      for (String sequence : sequences){
        logger.debug("Predicting sequence: " + sequence + " on JID: " + JID);
        lastsequence=sequence;

        try {
          output = doPredictionPI(sequence, hivFunction);
          if (output==null)
            noErrors++;
          else
            returnMap.put(sequence, output);
        } catch (XwsException e) {
          e.printStackTrace();
          noErrors++;
        }
      }

      logger.debug("Finished hivpred predicting. Results: " + returnMap.size() 
          + " correctly predicted sequences and " + noErrors + " errors.");

      //Take latest output and display in view

      if (output==null)
          return returnMap;
      
        //Store drugs here
        int nodrugs=output.getResult().size();
        String[] drugs=new String[nodrugs];
        double[] susres=new double[nodrugs];
        
        for (int i=0; i< output.getResult().size(); i++){
          drugs[i]=output.getResult().get(i).getName();
          susres[i]=output.getResult().get(i).getResult();
        }
        
        openChartView( lastsequence, drugs, susres );
      
      return returnMap;

    }

    private void openChartView( String lastsequence, String[] drugs,
                                double[] susres ) {

        final String[] displaydrugs = drugs;
        final double[] displaysusres = susres;
        final String displaysequence=lastsequence;
        
        //Run in UI thread
        Display.getDefault().syncExec(new Runnable(){

          public void run() {
            //Display HivpredResultView if hidden
            HIVPredictionResultView.show();
            HIVPredictionResultView.setDrugs(displaydrugs);
            HIVPredictionResultView.setPredictAnswer(displaysusres);
            HIVPredictionResultView.setSequence(displaysequence);
            HIVPredictionResultView.updateResults();
          }
          });
    }

    /**
     * Invoke the function for the sequence and return a result
     * @param sequence
     * @param hivFunction
     * @return
     * @throws XmppException
     * @throws XwsException
     * @throws InterruptedException
     */
    private HIVPredOutputType doPredictionPI(String sequence, 
                                             IFunction hivFunction) 
    throws XmppException, XwsException, InterruptedException {

      HIVPredInputType in = HivpredFactory.eINSTANCE.createHIVPredInputType();
      in.setSequence(sequence);

      DocumentRoot root=HivpredFactory.eINSTANCE.createDocumentRoot();
      root.setHIVPredInput(in);

      //Convert to DOM since inputElement must be this
      Element inputElement=EMFDOMConversion.getDomFromEMF(root);

      //Invoke sync service
      Element result = hivFunction.invokeSync(inputElement, 20000);

      if (result==null){
        logger.error("Result from hivpredrt was null.");
        return null;
      }

      logger.debug("Got good hivpred result from service:\n " 
                   + JavaDOMTools.w3cElementToString(result));

      //Convert output DOM to EMF
      EObject emfo = EMFDOMConversion.getEMFfromDOMusingJavaDOMtools(result);
      if (!(emfo instanceof DocumentRoot)) {
        logger.error("Result from hivpred was not a HIVpredRT DocumentRoot.");
        return null;
      }

      DocumentRoot docroot = (DocumentRoot) emfo;
      HIVPredOutputType hivOutput=docroot.getHIVPredOutput();
      return hivOutput;

    }

    
    
    /* *******
     * NRTI
     **********/

    /**
     * Predict on the default JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     * @throws BioclipseException 
     */
    public HIVPredRTOutputType predictNRTI(String sequence) 
    throws Xws4jException, XmppException, InterruptedException, 
           BioclipseException {

      Map<String, HIVPredRTOutputType> map = predictNRTI(sequence, 
                                   HIVPredictionContants.DEFAULT_HIVRTPRED_JID);
      for (String s : map.keySet()){
        //Return first match
        return map.get(s);
      }
      //Should not happen
      return null;
      
    }

    /**
     * Invoke hivpred prediction on the specified JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     * @throws BioclipseException 
     */
    public Map<String, HIVPredRTOutputType> predictNRTI(String sequence, 
                                                        String JID) 
                                                        throws Xws4jException, 
                                                        XmppException, 
                                                        InterruptedException, 
                                                        BioclipseException {

      List<String> sequences=new ArrayList<String>();

      //Try to interpret as path
      try{
        IFile file=ResourcePathTransformer.getInstance().transform(sequence);
        if (file!=null){
          logger.debug("Reading sequences from file: " 
                       + file.getRawLocation().toOSString());

          //Read file line by line
          java.util.Scanner sc = new java.util.Scanner(file.getContents());
          int cnt=0;
          while ( sc.hasNextLine() ) {
            cnt++;
            String tmpSeq=sc.nextLine();
            String validationMessage=validatorNRTI.isValid(tmpSeq);
            if (validationMessage==null){
              logger.debug("Added line " + cnt + " as valid sequence: " 
                           + tmpSeq);
              sequences.add(tmpSeq);
            }
            else{
              logger.error("Line #" + cnt + ": " + tmpSeq +" invalid: " 
                           + validationMessage);
            }
          }
        }

      }
      catch (Exception e){
          String singleSec=validatorNRTI.isValid(sequence);
        //Parsing of file failed, try interpret as a single sequence string
        if (singleSec==null){
          //Valid!
          sequences.add(sequence);
        }

        if (sequences.size()<=0){
            logger.debug("Error with service input: " + singleSec);
          throw new BioclipseException(singleSec);
        }
      }

      return predictNRTI(sequences, JID);

    }

    /**
     * Predict array of sequences on default JID
     * @return 
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public Map<String, HIVPredRTOutputType> predictNRTI(List<String> sequences) 
    throws Xws4jException, XmppException, InterruptedException, 
           BioclipseException {
      return predictNRTI(sequences, HIVPredictionContants.DEFAULT_HIVRTPRED_JID);
    }


    /**
     * Invoke hivpred prediction on the specified JID for the sequences
       * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    public Map<String, HIVPredRTOutputType> predictNRTI(List<String> sequences, 
                                                        String JID) 
                    throws Xws4jException, XmppException, InterruptedException, 
                    BioclipseException {

      //Connect if not connected
      if (!(xmpp.isConnected()))
        xmpp.connect();

      IFunction hivRTFunction = xmpp.getFunction(JID, 
                                          HIVPredictionContants.HIVRTPRED_NODE);

      Map<String, HIVPredRTOutputType> returnMap = 
                      new HashMap<String, HIVPredRTOutputType>();
      int noErrors=0;
      
      HIVPredRTOutputType output=null;
      String lastsequence="";
      for (String sequence : sequences){
        logger.debug("Predicting RT sequence: " + sequence + " on JID: " + JID);
        lastsequence=sequence;

        try {
          output = doPredictionNRTI(sequence, hivRTFunction);
          if (output==null)
            noErrors++;
          else
            returnMap.put(sequence, output);
        } catch (XwsException e) {
          e.printStackTrace();
          noErrors++;
        }
      }

      logger.debug("Finished hivprert predicting. Results: " + returnMap.size() 
          + " correctly predicted sequences and " + noErrors + " errors.");

      //Take latest output and display in view

      if (output==null)
          return returnMap;
      
        //Store drugs here
        int nodrugs=output.getResult().size();
        String[] drugs=new String[nodrugs];
        double[] susres=new double[nodrugs];
        
        for (int i=0; i< output.getResult().size(); i++){
          drugs[i]=output.getResult().get(i).getName();
          susres[i]=output.getResult().get(i).getResult();
        }
        
        openChartView( lastsequence, drugs, susres );
      
      return returnMap;

    }

    /**
     * Invoke the function for the sequence and return a result
     * @param sequence
     * @param hivRTFunction
     * @return
     * @throws XmppException
     * @throws XwsException
     * @throws InterruptedException
     */
    private HIVPredRTOutputType doPredictionNRTI(String sequence, 
                                                 IFunction hivRTFunction) 
    throws XmppException, XwsException, InterruptedException, 
    BioclipseException {

        HIVPredRTInputType in = HivpredrtFactory.eINSTANCE
        .createHIVPredRTInputType();
        in.setSequence(sequence);

        org.hivdrc.hivpredrt.DocumentRoot root=HivpredrtFactory
        .eINSTANCE.createDocumentRoot();
        root.setHIVPredRTInput(in);

        //Convert to DOM Element.  
        Element inputElement=
           org.hivdrc.hivpredrt.conversion.EMFDOMConversion.getDomFromEMF(root);
        
        
      //Invoke sync service
      Element result = hivRTFunction.invokeSync(inputElement, 20000);

      if (result==null){
        logger.error("Result from hivpredrt was null.");
        return null;
      }

      logger.debug("Got good hivpredrt result from service:\n " 
                   + JavaDOMTools.w3cElementToString(result));

      //Convert output DOM to EMF
      EObject emfo = org.hivdrc.hivpredrt.conversion.EMFDOMConversion.getEMFfromDOMusingJavaDOMtools(result);
      if (!(emfo instanceof org.hivdrc.hivpredrt.DocumentRoot)) {
        logger.error("Result from hivpredrt was not a HIVpredRT DocumentRoot.");
        return null;
      }

      org.hivdrc.hivpredrt.DocumentRoot docroot 
          = (org.hivdrc.hivpredrt.DocumentRoot) emfo;
      
      HIVPredRTOutputType hivOutput=docroot.getHIVPredRTOutput();
      return hivOutput;

    }
    
    
}
