package com.training.myapp.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\khbegum\\Documents\\workspace-sts-3.9.9.RELEASE\\LambdaExpression\\src\\main\\resources\\abc.properties");
	prop.load(fis);
	System.out.println(fis.toString());
	String s=prop.getProperty("user");
	System.out.println(s);
	prop.setProperty("seetha","7777");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\khbegum\\Documents\\workspace-sts-3.9.9.RELEASE\\LambdaExpression\\src\\main\\resources\\abc.properties");
	prop.store(fos, "hello");
	
	
}
}
