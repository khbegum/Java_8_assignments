package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.addition;

public class MyappTest {

	@Test
	public void testAdditionCheckWithPositiveNumbers() {
		assertEquals(12, addition.add(7,5));
	}
	@Test
	public void testAdditionCheckWithNegativeNumbers() {
		assertEquals(-10, addition.add(-4, -6));
	}
	@Test
	public void testAdditionCheckWithOnePositiveAndOneNegativeNumbers() {
		assertEquals(9, addition.add(19,-10));
	}

}
