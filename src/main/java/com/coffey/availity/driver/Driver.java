package com.coffey.availity.driver;

import com.coffey.availity.validator.InputValidator;
import com.coffey.availity.validator.LISPValidator;


/**
 * Program will evaluate if a LISP code is valid.
 * Validity will be evaluated by determining if
 * the parenthesis of the LISP code are balanced.
 * 
 * @author lucascoffey
 *
 */
public class Driver {
	
	
	public static void main(String[] args) {
		
		InputValidator inputValidator = new InputValidator();
		LISPValidator lispValidator = new LISPValidator();
		
		if(!inputValidator.isValid(args))
			System.exit(0);
				
		String lispCode = args[0].trim();
		
		boolean result = lispValidator.isBalanced(lispCode);
		
		System.out.println(result);

	}

	
	
}
