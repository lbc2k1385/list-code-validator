package com.coffey.availity.driver;

import java.util.Stack;



public class Driver {
	
	private static final char OPEN_PARENTHESIS = '(';
	private static final char CLOSED_PARENTHESIS = ')';

	public static void main(String[] args) {
		
		//Validate Input
		if(args != null && args.length == 0) {
			System.out.println("You must pass exactly 1 argument.");  
		}else if(args.length > 1) {
			System.out.println("The argument must be 1 string as per requirment");   
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		String lispCode = args[0].trim();
		
		boolean result = isBalanced(stack, lispCode);
		
		System.out.println(result);

	}

	private static boolean isBalanced(Stack<Character> stack, String lispCode){
		
		for(char currentChar: lispCode.toCharArray()) {
			
			//This will force the first character to be a '('.  If it is not then the next will return false
			if(OPEN_PARENTHESIS == currentChar) {
				stack.push(currentChar);			
			}else if(stack.isEmpty()) {
				return false;
			}else if(stack.peek() == OPEN_PARENTHESIS && CLOSED_PARENTHESIS == currentChar)  {		
				stack.pop();				
			}
			
		}
		
		return stack.isEmpty();
	}
	
}
