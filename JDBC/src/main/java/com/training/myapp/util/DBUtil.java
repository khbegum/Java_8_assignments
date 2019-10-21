package com.training.myapp.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
private static String USERNAME;
private static String PASSWORD;
private static String DB_URL;
private static Connection connection;

static {
	try {
	Properties prop=new Properties();
	prop.load(new FileInputStream("C:\\Users\\khbegum\\Documents\\workspace-sts-3.9.9.RELEASE\\JDBC\\src\\main\\resources\\jdbc.properties"));
	USERNAME=prop.getProperty("USERNAME");
	PASSWORD=prop.getProperty("PASSWORD");
	DB_URL=prop.getProperty("DB_URL");
	
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
public static Connection getConnection() throws SQLException {
	connection=DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	
	return connection;
	
}

}
