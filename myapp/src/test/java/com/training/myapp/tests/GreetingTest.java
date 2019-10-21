package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Helloworld;

public class GreetingTest {
	
	@Test
	public void testGreeting() {
		assertEquals("Hello World", Helloworld.greet("Hello World"));
	}

}
