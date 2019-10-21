package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.PencilBox;

public class PencilBoxTest {

	@Test
	public void test() {
		assertEquals(34,PencilBox.countOfThingsInPencilBox(new PencilBox(5,2,1,1),new PencilBox(3,2,1,19)));	}

}
