package com.qa.main;

public class Main {

	public static void main(String[] args) {
		boolean isSunny = false;
		
		if (isSunny) {
			System.out.println("It's Sunny");
		} else {
			System.out.println("It's cloudy");
		}
		
		System.out.println("\n =======================");
		
		int val1 = 100;
		
		if(val1 == 200) {
			System.out.println("is equal to 200");
		} else {
			System.out.println("Not equal");
		}
		
		System.out.println("\n =======================");
		
		int val2 = 200;
		
		if(val2 != 200) {
			System.out.println("is not equal to 200");
		} else {
			System.out.println("Is equal");
		}
		
		System.out.println("\n =======================");

		int aVal1 = 42;
		int aVal2 = 45;
		
		if(aVal1 > aVal2) {
			System.out.println("aVal1 is greater than aVal2");
		} else {
			System.out.println("val1 is less than val2");
		}
		
		
	}

}
