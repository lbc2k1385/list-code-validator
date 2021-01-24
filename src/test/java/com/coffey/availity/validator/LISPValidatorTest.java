package com.coffey.availity.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LISPValidatorTest {
	
	LISPValidator validator = new LISPValidator();

	@Test
	void isBalancedTest_SinglePair_True() {
		
		String lispCode= "()";

		boolean result = validator.isBalanced(lispCode);
		
		assertTrue(result);
	}
	
	@Test
	void isBalancedTest_ParenthesisWithTextTrue() {
		
		String lispCode= "(Te(st)ing)";

		boolean result = validator.isBalanced(lispCode);
		
		assertTrue(result);
	}
	
	@Test
	void isBalancedTest_NestedParenthesis_True() {
		
		String lispCode= "(())";

		boolean result = validator.isBalanced(lispCode);
		
		assertTrue(result);
	}
	
		
	@Test
	void isBalancedTest_OpenParenthesis_False() {
		
		String lispCode= "(";
		
		boolean result = validator.isBalanced(lispCode);
		
		assertFalse(result,"Parenthesis must be closed");
			
	}
	
	@Test
	void isBalancedTest_ClosedParenthesis_False() {
		
		String lispCode= ")";
		
		boolean result = validator.isBalanced(lispCode);
		
		assertFalse(result,"Parenthesis must be opened before closed");		
		
	}
	
	@Test
	void isBalancedTest_UnbalancedTest_False() {
		
		String lispCode= "(Test()";
		
		boolean result = validator.isBalanced(lispCode);
		
		assertFalse(result,"Parenthesis must be balanced");
				
	}
	
	


}
