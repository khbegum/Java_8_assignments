package com.training.myapp;

import com.training.myapp.model.Date;

public class MainDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();//No argument Constructor
		//mutators
		
		d1.setDay(23);
		d1.setMonth(9);
		d1.setYear(2019);
		//accesors
		System.out.println(d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		
		Date d2=new Date();//No argument Constructor
		Date d3=new Date(22,9,2019);//Parameterized Constructor
		System.out.println(d2);
		System.out.println(d3);
		//Date e=new Employee(1,"khairu",12000);
	}

}
