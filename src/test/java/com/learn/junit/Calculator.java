 package com.learn.junit;

import org.junit.jupiter.api.Test;

class Calculator {

	@Test
	public static String checkEvenOdd(int i) {
		String actualResult = Calculator.checkEvenOdd(20);
		String expectedResult = "7 is good";
		return expectedResult;
	}

	

}
