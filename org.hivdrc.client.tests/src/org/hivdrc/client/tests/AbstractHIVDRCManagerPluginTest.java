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
package org.hivdrc.client.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import net.bioclipse.xws.JavaDOMTools;
import net.bioclipse.xws.client.adhoc.IFunction;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws.exceptions.XwsException;
import net.bioclipse.xws4j.Activator;
import net.bioclipse.xws4j.business.XwsManager;
import net.bioclipse.xws4j.exceptions.Xws4jException;
import net.bioclipse.xws4j.preferences.PreferenceConstants;

import org.hivdrc.hivpred.DocumentRoot;
import org.hivdrc.hivpred.HIVPredInputType;
import org.hivdrc.hivpred.HIVPredOutputType;
import org.hivdrc.hivpred.HivpredFactory;
import org.hivdrc.hivpred.conversion.EMFDOMConversion;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;

/**
 * 
 * @author ola
 *
 */
public abstract class AbstractHIVDRCManagerPluginTest {

    //For comparing doubles
    private static final double EPSILON = 0.0001;

    private final String jid="test@ws1.bmc.uu.se";
    private final String resource="bioclipse";
    private final String pwd="test";
    private final String server="ws1.bmc.uu.se";
    private final int server_port=5222;

    protected static IHIVDRCManager hivdrc;
    
    
    @Before
    public void initializeXMPPcredentials() {

      //XWS uses preferences, so set prefs for XWS
      IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
      preferences.setValue(PreferenceConstants.P_STRING_JID, jid);
      preferences.setValue(PreferenceConstants.P_STRING_RESOURCE, resource);
      preferences.setValue(PreferenceConstants.P_STRING_PASSWORD, pwd);
      preferences.setValue(PreferenceConstants.P_STRING_SERVER, server);
      preferences.setValue(PreferenceConstants.P_STRING_SERVERPORT, server_port);

    }

    /**
     * Test predict using code directly
     * @throws XmppException
     * @throws XwsException
     * @throws InterruptedException
     * @throws Xws4jException
     */
    @Test
    public void testHivpredServiceDirectly() throws XmppException, XwsException, InterruptedException, Xws4jException{

      String sequence="PQITLWQRPLVTIKIGCQLKEALLDTGADDTVLEEANLPGRWKPKMIGGIGGFIKVRQYDQILIEICGHKAIGTVLVGPTPVNIIGRNLLTQIGCTLNF";
      String predictionServer="hivpred.ws1.bmc.uu.se";
      String predictionFunction="predictSusceptibility";
      
      XwsManager xmpp = new XwsManager();

      //Connect if not connected (requires JID and password in preferences)
      if (!(xmpp.isConnected()))
        xmpp.connect();

      //Set up function
      IFunction hivFunction = xmpp.getFunction(predictionServer, predictionFunction);
      
      HIVPredInputType in = HivpredFactory.eINSTANCE.createHIVPredInputType();
      in.setSequence(sequence);

      DocumentRoot root=HivpredFactory.eINSTANCE.createDocumentRoot();
      root.setHIVPredInput(in);

      //Convert to DOM since inputElement must be this
      Element inputElement=EMFDOMConversion.getDomFromEMF(root);

      //Invoke sync service
      Element result = hivFunction.invokeSync(inputElement, 20000);
      
      assertNotNull("Result from hivpred is null", result);

      System.out.println("Got good hivpred result from service: " + JavaDOMTools.w3cElementToString(result));

      //Convert output DOM to EMF
//      EObject emfo = EMFDOMConversion.getEMFfromDOM(result);
      

      //    Element el = document.getDocumentElement();
      EObject emfo = EMFDOMConversion.getEMFfromDOMusingJavaDOMtools(result);
      
      
      if (!(emfo instanceof DocumentRoot)) {
        fail("Result from hivpred was not a HIVpred DocumentRoot.");
      }

      DocumentRoot docroot = (DocumentRoot) emfo;
      HIVPredOutputType hivOutput=docroot.getHIVPredOutput();
      assertNotNull(hivOutput);
      assertEquals(7, hivOutput.getResult().size());
      
    }


    /**
     * Test predict using the hivpredmanager
     * @throws Xws4jException
     * @throws XmppException
     * @throws InterruptedException
     */
    @Test
    public void testPredictString() throws Xws4jException, XmppException, InterruptedException  {
      String seq="AAAALWQRPLVTIKIGGQLKEALLDTGADDTVLEEMNLPGRWKPKMIGGIGGFIKVRQYDQILIEICGHKAIGTVLVGPTPVNIIGRNLLTQIGCTLNF";
      HIVPredOutputType res = hivdrc.predict(seq);
      assertNotNull(res);

      /*
      <?xml version="1.0" encoding="ASCII"?><hivpred:HIVPredOutput xmlns:hivpred="http://www.hivdrc.org/hivpred" errorMessage="">
         <hivpred:mutNotInDataset name="P1A"/>
         <hivpred:mutOutsideModelBoundaries name="Q2A"/>
         <hivpred:mutOutsideModelBoundaries name="I3A"/>
         <hivpred:result name="amprenavir" result="-9.344846031197962"/>
         <hivpred:result name="atazanavir" result="-8.081778845481008"/>
         <hivpred:result name="indinavir" result="-8.306376101045098"/>
         <hivpred:result name="lopinavir" result="-8.789871555954795"/>
         <hivpred:result name="nelfinavir" result="-7.661361493579009"/>
         <hivpred:result name="ritonavir" result="-8.108639981136413"/>
         <hivpred:result name="saquinanvir" result="-8.702355550536716"/>
      </hivpred:HIVPredOutput>
      */
      
      assertEquals("", res.getErrorMessage());
      assertEquals(1, res.getMutNotInDataset().size());
      assertEquals("P1A", res.getMutNotInDataset().get(0).getName());
      assertEquals(2, res.getMutOutsideModelBoundaries().size());
      assertEquals("Q2A", res.getMutOutsideModelBoundaries().get(0).getName());
      assertEquals("I3A", res.getMutOutsideModelBoundaries().get(1).getName());

      assertEquals(7, res.getResult().size());
      assertEquals("amprenavir", res.getResult().get(0).getName());
      assertEquals(-9.344846031197962, res.getResult().get(0).getResult(), EPSILON);
      assertEquals("atazanavir", res.getResult().get(1).getName());
      assertEquals(-8.081778845481008, res.getResult().get(1).getResult(), EPSILON);
      assertEquals("indinavir", res.getResult().get(2).getName());
      assertEquals(-8.306376101045098, res.getResult().get(2).getResult(), EPSILON);
      assertEquals("lopinavir", res.getResult().get(3).getName());
      assertEquals(-8.789871555954795, res.getResult().get(3).getResult(), EPSILON);
      assertEquals("nelfinavir", res.getResult().get(4).getName());
      assertEquals(-7.661361493579009, res.getResult().get(4).getResult(), EPSILON);
      assertEquals("ritonavir", res.getResult().get(5).getName());
      assertEquals(-8.108639981136413, res.getResult().get(5).getResult(), EPSILON);
//      assertEquals("saquinavir", res.getResult().get(6).getName());
      //TODO: fix misspelling in sus7.jar class PredictionResult
      //saquinanvir -> saquinavir
      assertEquals(-8.702355550536716, res.getResult().get(6).getResult(), EPSILON);

      System.out.println(res);

    } 
    
    
    @Test
    public void testPredictFileWithSingleLine() throws Xws4jException, 
    XmppException, InterruptedException, URISyntaxException, 
    MalformedURLException, IOException  {
      
          URI uri = getClass().getResource("/testFiles/single.seq").toURI();
          URL url=FileLocator.toFileURL(uri.toURL());
          String path=url.getFile();
          
          System.out.println("Trying to predict file: " + path);

      HIVPredOutputType res = hivdrc.predict(path);
      assertNotNull(res);

      //File contains same string as in testPredictString() method
      assertEquals("", res.getErrorMessage());
      assertEquals(1, res.getMutNotInDataset().size());
      assertEquals("P1A", res.getMutNotInDataset().get(0).getName());
      assertEquals(2, res.getMutOutsideModelBoundaries().size());
      assertEquals("Q2A", res.getMutOutsideModelBoundaries().get(0).getName());
      assertEquals("I3A", res.getMutOutsideModelBoundaries().get(1).getName());

      assertEquals(7, res.getResult().size());
      assertEquals("amprenavir", res.getResult().get(0).getName());
      assertEquals(-9.344846031197962, res.getResult().get(0).getResult(), EPSILON);
      assertEquals("atazanavir", res.getResult().get(1).getName());
      assertEquals(-8.081778845481008, res.getResult().get(1).getResult(), EPSILON);
      assertEquals("indinavir", res.getResult().get(2).getName());
      assertEquals(-8.306376101045098, res.getResult().get(2).getResult(), EPSILON);
      assertEquals("lopinavir", res.getResult().get(3).getName());
      assertEquals(-8.789871555954795, res.getResult().get(3).getResult(), EPSILON);
      assertEquals("nelfinavir", res.getResult().get(4).getName());
      assertEquals(-7.661361493579009, res.getResult().get(4).getResult(), EPSILON);
      assertEquals("ritonavir", res.getResult().get(5).getName());
      assertEquals(-8.108639981136413, res.getResult().get(5).getResult(), EPSILON);
//      assertEquals("saquinavir", res.getResult().get(6).getName());
      //TODO: fix misspelling in sus7.jar class PredictionResult
      //saquinanvir -> saquinavir
      assertEquals(-8.702355550536716, res.getResult().get(6).getResult(), EPSILON);

      System.out.println(res);

    } 

    
    
    /* *******
     * NRTI
     ********/

    String seq239   = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKW";
    String seq240   = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKXRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWT";
    String seq240_W = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWT";
    String seq241   = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWTx";
    String seq242   = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWTxx";
    String seq242_W = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTXXKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWT";
    String seq243   = "PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWTxxx";

    //TBC

    
}
