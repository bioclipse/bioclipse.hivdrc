/*******************************************************************************
 * Copyright (c) 2005-2006 Bioclipse Project
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ola Spjuth - core API and implementation
 *******************************************************************************/

package org.hivdrc.client.dialogs;

import java.rmi.RemoteException;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * This class represents a long running operation to delete IBioResources in an ArrayList.
 * If list contains folders, first remove the subResources of the folder and then the folder itself.
 * 
 * @author ola
 */
public class PredictProgressDialog implements IRunnableWithProgress {

	double[] predictAnswer;
	String[] drugs;
	String sequence;

	public String[] getDrugs() {
		return drugs;
	}

	public void setDrugs(String[] drugs) {
		this.drugs = drugs;
	}

	/**
	 * Constructor
	 * @param sequence Protease sequence to predict susceptibility for
	 */
	public PredictProgressDialog(String sequence) {
		super();
		this.sequence = sequence;
	}

	public double[] getPredictAnswer() {
		return predictAnswer;
	}

	public void setPredictAnswer(double[] predictAnswer) {
		this.predictAnswer = predictAnswer;
	}

	/**
	 * Runs the long running operation
	 * 
	 * @param monitor the progress monitor
	 * @throws InterruptedException
	 */
	public void run(IProgressMonitor monitor) throws InterruptedException {

		//Step through and delete all these files
		monitor.beginTask("Predicting susceptibility using the HIV Protease Susceptibility Web service",10);

		//Here we should call the XMPP service
		//FIXME

		/*
		try {

			//Get drugs from Web service that will be used in prediction
			//*******************************
			monitor.subTask("Contacting web service");
			drugs=loc.getPredict().getDrugs();
			
			monitor.worked(5);

			//Do prediction using Web service
			//*******************************
			monitor.subTask("Predicting");
//			System.out.println("Predicting susceptibility for sequence: " + sequence);
			predictAnswer=loc.getPredict().doPrediction(sequence);
			
		} catch (RemoteException e) {
			throw new InterruptedException("Could not connect to remote server. Server might be down.");
		}
		
		*/
		monitor.done();
		if (monitor.isCanceled())
			throw new InterruptedException("Web service was cancelled");
	}

}