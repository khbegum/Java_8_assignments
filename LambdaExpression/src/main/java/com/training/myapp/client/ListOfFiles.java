package com.training.myapp.client;

import java.io.File;
import java.io.FileFilter;

public class ListOfFiles {
	public static void main(String[] args) {      
	      File f = null;
	      File[] paths;
	      
	      try { 
	      
	         // create new file
	         f = new File("C:\\Users\\khbegum\\Pictures\\Screenshots");
	         
//	         FileFilter filter = new FileFilter() {
//	            public boolean accept(File pathname) {
//	               return pathname.isFile();
//	            }
	         FileFilter filter=(File pathname)->pathname.isFile();

			
	         
	         
	         // returns pathnames for files and directory
	         paths = f.listFiles(filter);
	         
	         // for each pathname in pathname array
	         for(File path:paths) {
	         
	            // prints file and directory paths
	            System.out.println(path);
	         }
	         
	      } catch(Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      }
	   }
}
