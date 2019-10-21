package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.myapp.MyCar;
import com.training.myapp.model.CarList;

public class CarTest {
	private TreeSet<CarList> cars = new TreeSet<CarList>();

	@Before
	public void setUp() {
		cars.add(new CarList("Skoda", "rapid", 800000, 2012));
		cars.add(new CarList("Maruti", "swift", 200000, 1990));
		cars.add(new CarList("Hyundai", "i10", 300000, 2000));
		cars.add(new CarList("Volkswagen", "vento", 400000, 1990));
	}

	@Test
	public void testCarModelNameSorting() {

		Iterator<CarList> car = cars.iterator();
		// it checks equality of make and mode
		assertEquals(new CarList("Hyundai", "i10", 800000.0, 2012), car.next());
		assertEquals(new CarList("Skoda", "rapid", 3000000, 2019), car.next());
		assertEquals(new CarList("Maruti", "swift", 13000, 2013), car.next());
		assertEquals(new CarList("Volkswagen", "vento", 300000, 2000), car.next());

		
	}

	@After
	public void tearDown() {
		cars = null;
	}
}
