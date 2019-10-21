package com.training.myapp;

import com.training.myapp.exception.InvalidException;

public class Calulate {

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public static int divison(int i, int j) throws InvalidException {
		// TODO Auto-generated method stub
		
		if(j>=1)
		return i/j;
		else
			throw new InvalidException("Enter any number except 0");
	}

}
