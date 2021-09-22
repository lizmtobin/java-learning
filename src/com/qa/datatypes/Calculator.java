package com.qa.datatypes;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int x = 4;
		int y = 4;
		System.out.println(addition(x,y));
		System.out.println(multiply(x,y));
		System.out.println(subtract(x,y));
		System.out.println(divide(x,y));
	}

	public static int addition(int x, int y) {
		return x + y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static double divide(double x, double y) {
		double sum = x / y;
		
		if (x < y) {
		 return sum;	
		} else {
		 System.out.println("Division cannnot be performed");
		 return 0;
		}
	}
	
}
