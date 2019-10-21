package com.training.myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.training.myapp.model.CarList;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<CarList> cars = new HashSet<CarList>();
		cars.add(new CarList("Skoda", "rapid", 800000, 2012));
		cars.add(new CarList("Maruti", "swift", 200000, 1990));
		cars.add(new CarList("Hyundai", "i10", 300000, 2000));
		cars.add(new CarList("Volkswagen", "jhj", 400000, 1990));
		cars.add(new CarList("Volkswagen", "jhj", 400000, 1990));
		for (CarList car : cars)
			System.out.println(car);
		Collections.addAll(cars, new CarList("BMW", "E3", 300000, 2019), new CarList("Benz", "dscs", 200000, 2013));
		for (CarList car : cars)
			System.out.println(car);

	}

//Iterator<CarList> car=cars.iterator();
//System.out.println(car);
}
