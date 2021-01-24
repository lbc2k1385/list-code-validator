package com.coffey.availity.validator;

import java.util.Stack;

/**
 * This validator is intended to check the validity of the LISP code.
 * @author Lucas Coffey
 *
 */
public class LISPValidator {
	
	private static final char OPEN_PARENTHESES = '(';
	private static final char CLOSED_PARENTHESES = ')';
	
	/** 
	 * Will return true if the lispCode is balanced.
	 * 
	 * Example of balanced:
	 * 	()
	 * 	(())
	 * @param lispCode
	 * @return
	 */
	public boolean isBalanced(String lispCode){
		
		Stack<Character> stack = new Stack<Character>();
			
		for(char currentChar: lispCode.toCharArray()) {
			
			//First check will force the first character to be a '('.  If it is not then the next check will return false
			if(OPEN_PARENTHESES == currentChar) {
				stack.push(currentChar);			
			}else if(stack.isEmpty()) {
				return false;
			}else if(stack.peek() == OPEN_PARENTHESES && CLOSED_PARENTHESES == currentChar)  {		
				stack.pop();				
			}
			
		}			
			return stack.isEmpty();
		}

}
