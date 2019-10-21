package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Calulate;
import com.training.myapp.exception.InvalidException;

public class CalculatorTest {

	@Test
	public void testAdditionOfTwoNumbers() {
		assertEquals(5,Calulate.add(2,3));
	}
	@Test
	public void testSubtractionOfTwoNumbers() {
		assertEquals(5, Calulate.subtract(10,5));
	}
	@Test
	public void testDivisionOfTwoNumbers() throws InvalidException {
		assertEquals(2, Calulate.divison(6,0));
	}
	

}
