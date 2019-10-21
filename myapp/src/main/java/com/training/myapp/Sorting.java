package com.training.myapp;

public class Sorting {
	
	public static  int[] descendingOrder(int[] array) {
	   
		   int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] >array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   System.out.print("Descending Order");
		   for (int i = 0; i < array.length; i++) {
			   
		     System.out.print(array[i]);
		   }
		   return array;

}

	public static int[] ascendingOrder(int[] array) {
		// TODO Auto-generated method stub
		int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] <array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   System.out.print("Ascending Order");
		   for (int i = 0; i < array.length; i++) {
			   
		     System.out.print(array[i]);
		   }
		   return array;

	}
	
	

}
