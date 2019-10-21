package com.training.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.training.myapp.util.DBUtil;

public class BikeDao {

	public boolean addBike(Bike b) {
		String query="Insert into bikes(bike_id,bike_name,bike_colour,bike_price) values(?,?,?,?) ";
		try(Connection connection=DBUtil.getConnection();
				PreparedStatement statement=connection.prepareStatement(query)){
			statement.setInt(1, b.getBikeId());
			statement.setString(2, b.getBikeName());
			statement.setString(3, b.getBikeColour());
			statement.setDouble(4, b.getBikePrice());
			statement.executeUpdate();
			return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return false;
		
	}
	
	
	
}
