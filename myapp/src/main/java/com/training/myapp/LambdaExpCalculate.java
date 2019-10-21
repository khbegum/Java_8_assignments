package com.training.myapp;
@FunctionalInterface
interface CalculateInterface {
public   int calculate(int a,int b);
}



public class LambdaExpCalculate  {


public static void main(String[] args) {
	//int a=10,b=5;
	CalculateInterface add=(a,b)->a+b;
	CalculateInterface sub=(a,b)->a-b;
	CalculateInterface mul=(a,b)->a*b;
	CalculateInterface div=(a,b)->a/b;
	
//	int addition=add.caluculate(l, b1);
//	int subtraction=sub.caluculate(l, b1);
//	int multiplication=mul.caluculate(l, b1);
//	int divison =div.caluculate(l, b1);
	
	
	System.out.println("Addition of two numbers is: "+add.calculate(2, 3));
	System.out.println("Subtraction of two numbers is:"+sub.calculate(10,3));
	System.out.println("Multiplicatin of two numbers is:"+mul.calculate(4, 5));
	System.out.println("Division of two numbers is :"+div.calculate(10, 5));
	
	
}}




