package com.training.myapp.main;



import java.sql.Connection;

import com.training.myapp.model.Bike;
import com.training.myapp.model.BikeDao;
import com.training.myapp.util.DBUtil;

public class BikeJDBC {
public static void main(String[] args) {
	try(Connection connection=DBUtil.getConnection()){
		if(connection!=null)
			System.out.println("---connected-----");
		
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("--failed-----");
	}
	BikeDao bike=new BikeDao();
	if(bike.addBike(new Bike(101,"Pulsar","Black",80000)))
		System.out.println("New bike added");
	else
		System.out.println("--unable to add---");
	
	
	
}
}
