package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ComplexNumber;

public class ComplexNumberTest {

	@Test
	public void testComplexNumbersAddition() {
		  assertArrayEquals(new int[]{10,18}, ComplexNumber.complexNumberAdd(new ComplexNumber(6,9),new ComplexNumber(4,9)));
	}

		
		

}
