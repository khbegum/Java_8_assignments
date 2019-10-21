package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.MainDate;
import com.training.myapp.exception.InvalidDayException;
import com.training.myapp.exception.InvalidMonthException;
import com.training.myapp.model.Date;

public class DateTest {



	@Test
	public void testisSwapOfDates() {
		assertTrue("two dates are swapped",(Date.swapofdates(new Date(24,9,2019), new Date(23,9,2019))));
	
	}
	@Test
	public void testMonthOfDates() throws InvalidMonthException {
		assertEquals(false, Date.checkMonth(new Date(12,13,2019)));
	}
	@Test
	public void testDayOfMonth () throws InvalidDayException {
		assertEquals(false,Date.checkDay(new Date(78,2,2018)));
	}

}
