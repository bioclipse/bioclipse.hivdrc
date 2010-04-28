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

import java.util.List;
import java.util.Map;

import org.hivdrc.hivpred.HIVPredOutputType;
import org.hivdrc.hivpredrt.HIVPredRTOutputType;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.managers.business.IBioclipseManager;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws4j.exceptions.Xws4jException;

/**
 * 
 * @author ola
 */
@PublishedClass(
    value="A manager for invoking the HIVDRC services."
)
public interface IHIVDRCManager extends IBioclipseManager {

    /**
     * Invoke the hivpred XMPP service on a protease sequence, 99 aa String.
     * @param sequence The 99 aa HIV protease sequence to predict or path to file
     * @return Result for the Sequence
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "protease sequence or path to sequence file, containing a 99 aa " +
        "long string in one letter aa code.",
                      params = "String sequence" )
    @Recorded
    public HIVPredOutputType predictPI(String sequence) throws Xws4jException, XmppException, InterruptedException;

    /**
     * Invoke the hivpred XMPP service on a protease sequence, 99 aa String.
     * @param sequence The 99 aa HIV protease sequence to predict or path to file
     * @param server the JID av an XMPP Hivpred service
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "protease sequence or path to sequence file, containing a 99 aa " +
        "long string in one letter aa code, on a specified JID of an " +
        "existing XMPP hivpred service",
                      params = "String sequence, String JID" )
    @Recorded
    public Map<String, HIVPredOutputType> predictPI(String sequence, String JID) throws Xws4jException, XmppException, InterruptedException;

    /**
     * Invoke the hivpred XMPP service on a list of protease sequences, 99 aa String.
     * @param sequences A list of 99 aa HIV protease sequences to predict
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "list of protease sequences, each comprising a 99 aa " +
        "long string in one letter aa code.",
                      params = "String sequence" )
    @Recorded
  Map<String, HIVPredOutputType> predictPI(List<String> sequences) throws Xws4jException, XmppException, InterruptedException;

    
    /**
     * Invoke the hivpred XMPP service on a list of protease sequences, 99 aa String.
     * @param sequences A list of 99 aa HIV protease sequences to predict
     * @param server the JID av an XMPP Hivpred service
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "list of protease sequences, each comprising a 99 aa " +
        "long string in one letter aa code, on a specified JID of an " +
        "existing XMPP hivpred service",
                      params = "String sequence, String JID" )
    @Recorded
  Map<String, HIVPredOutputType> predictPI(List<String> sequences, String JID) throws Xws4jException, XmppException, InterruptedException;


    /* *******
     * NRTI
     *********/
 
    /**
     * Invoke the hivpredRT XMPP service on a NRTI sequence, 240 aa String.
     * @param sequence The sequence to predict or path to file
     * @return Result for the Sequence
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpredRT XMPP service on a " +
        "NRTI sequence or path to sequence file, containing a 240 aa " +
        "long string in one letter aa code.",
                      params = "String sequence" )
    @Recorded
    public HIVPredRTOutputType predictNRTI(String sequence) throws Xws4jException, XmppException, InterruptedException;

    /**
     * Invoke the hivpredRT XMPP service on a NRTI sequence, 240 aa String.
     * @param sequence The sequence to predict or path to file
     * @param server the JID av an XMPP Hivpred service
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpredRT XMPP service on a " +
        "NRTI sequence or path to sequence file, containing a 240 aa " +
        "long string in one letter aa code, on a specified JID of an " +
        "existing XMPP hivpred service",
                      params = "String sequence, String JID" )
    @Recorded
    public Map<String, HIVPredRTOutputType> predictNRTI(String sequence, String JID) throws Xws4jException, XmppException, InterruptedException;

    /**
     * Invoke the hivpredRT XMPP service on a NRTI sequence, 240 aa String.
     * @param sequences A list of NRTI sequences to predict
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "list of NRTI sequences, each comprising a 240 aa " +
        "long string in one letter aa code.",
                      params = "String sequence" )
    @Recorded
  Map<String, HIVPredRTOutputType> predictNRTI(List<String> sequences) throws Xws4jException, XmppException, InterruptedException;

    
    /**
     * Invoke the hivpred XMPP service on a list of protease sequences, 99 aa String.
     * @param sequences A list of 99 aa HIV protease sequences to predict
     * @param server the JID av an XMPP Hivpred service
     * @return Map from Sequences to Result
     * @throws XmppException 
     * @throws Xws4jException 
     * @throws InterruptedException 
     */
    @PublishedMethod( methodSummary = "Invoke the hivpred XMPP service on a " +
        "list of protease sequences, each comprising a 99 aa " +
        "long string in one letter aa code, on a specified JID of an " +
        "existing XMPP hivpred service",
                      params = "String sequence, String JID" )
    @Recorded
  Map<String, HIVPredRTOutputType> predictNRTI(List<String> sequences, String JID) throws Xws4jException, XmppException, InterruptedException;

    
 

    
}
