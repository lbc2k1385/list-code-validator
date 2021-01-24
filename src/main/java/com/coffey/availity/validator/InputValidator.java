package com.coffey.availity.validator;

/**
 * This validator is intended to check the validity of the argument 
 * being passed into the program.
 * 
 * @author Lucas Coffey
 *
 */
public class InputValidator {
	
	/**
	 * Will return true if String[] is exactly 1 argument.
	 * If it is not exactly 1 argument the appropriate error
	 * message will be displayed, and the return value will be
	 * false
	 * @param input
	 * @return
	 */
	public boolean isValid(String[] input) {
		
		boolean result = true;
		
		if(input!= null && input.length == 0) {
			System.out.println("You must pass exactly 1 argument."); 
			result = false;
		}else if(input.length > 1) {
			System.out.println("The argument must be 1 string as per requirment");   
			result = false;
		}
		return result;
	}

}
