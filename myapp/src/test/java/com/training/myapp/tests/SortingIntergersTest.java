package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Sorting;

public class SortingIntergersTest {

	@Test
	public void testDescendingOrderSorting() {

assertArrayEquals(new int[]{3,2,1},Sorting.descendingOrder(new int[]{1,2,3}));
	}
	@Test
	public void testAscendingOrderSorting() {
		assertArrayEquals(new int[]{1,2,3},Sorting.ascendingOrder(new int[]{3,2,1}));
	}

}
