package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.training.myapp.exception.CountryNotValidException;
import com.training.myapp.exception.EmployeeNameInvalidException;
import com.training.myapp.exception.TaxNotEligibleException;
import com.training.myapp.model.TaxCalculator;

public class TaxCalculatorTest {

	
	
	@Test(expected=CountryNotValidException.class)
	public void testWhetherTheCitizenIsIndian() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		TaxCalculator.calculateTax(new TaxCalculator("Ron",34000,false));
		//assertEquals("CountryNotValidException", TaxCalculator.calculateTax(new TaxCalculator("SreeLekha",23000,false)));
		
	}
	@Test(expected=TaxNotEligibleException.class)
	public void testSalaryIsWithInLimit() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		TaxCalculator.calculateTax(new TaxCalculator("Tim", 1000,true));

	}
	@Test
	public void test() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(3300, TaxCalculator.calculateTax(new TaxCalculator("Jack",55000,true)));
	}
	@Test(expected=EmployeeNameInvalidException.class)
		public void testIfNameIsNull() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
			TaxCalculator.calculateTax(new TaxCalculator(null, 30000,true));
			
			
		}
	@Test(expected=EmployeeNameInvalidException.class)
	public void testIfNameIsEmpty() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		TaxCalculator.calculateTax(new TaxCalculator("", 30000, true));
	}
	
	
	
	

	
	}
	
	

