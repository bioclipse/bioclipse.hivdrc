package org.hivdrc.client;

import java.util.HashSet;
import java.util.Set;


import org.eclipse.jface.dialogs.IInputValidator;

public class FixedLengthProteinSequenceValidator implements IInputValidator {

	int exactLength;
	Set<String> AAcodes;
	
	@SuppressWarnings("unchecked")
	public FixedLengthProteinSequenceValidator(int length){
		this.exactLength=length;
		setupValidAminoAcids();
	}

	/**
	 * Set up valid AA single letter codes in a collection.<br>
	 * Only add lowercase so convert to lowercase before a contains().
	 *
	 */
	private void setupValidAminoAcids() {
		AAcodes=new HashSet<String>();
		AAcodes.add("a");
		AAcodes.add("b");
		AAcodes.add("c");
		AAcodes.add("d");
		AAcodes.add("e");
		AAcodes.add("f");
		AAcodes.add("g");
		AAcodes.add("h");
		AAcodes.add("i");
		AAcodes.add("k");
		AAcodes.add("l");
		AAcodes.add("m");
		AAcodes.add("n");
		AAcodes.add("p");
		AAcodes.add("q");
		AAcodes.add("r");
		AAcodes.add("s");
		AAcodes.add("t");
		AAcodes.add("u");
		AAcodes.add("v");
		AAcodes.add("w");
		AAcodes.add("y");
		AAcodes.add("z");

		//AAcodes.add("x"); //TODO: check if this should be allowed

	}

	/**
	 * return null if valid, Error string otherwise.
	 */
	public String isValid(String input) {

		//Check for null input
		if (input == null || input.length() == 0)
			return "Sequence cannot be empty";
		
		//Loop through all and locate any non-existing aminoacids
		for (int i=0; i<input.length(); i++){
			if (!(AAcodes.contains(input.substring(i,i+1).toLowerCase()))){
				return "Sequence position " + (i+1) + "='" + input.substring(i,i+1) 
				+ "' is not recognized as a single letter amino acid code";
			}
		}

		//Check if too short
		if (input.length()<exactLength){
			return "Sequence is too short (" + input.length() +"). Must be " 
			+ exactLength + " aa long.";
		}

		//Check if too long
		if (input.length()>exactLength){
			return "Sequence is too long (" + input.length() +"). Must be " 
			+ exactLength + " aa long.";
		}
		

		return null;
	}
}
