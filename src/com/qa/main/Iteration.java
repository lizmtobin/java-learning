package com.qa.main;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 12;
		System.out.println(addUpDoubleDigit(number1));
	}
	
	public static void addUpDoubleDigit(int number) {
		while (number > 0) {
			int num = (number % 10)/ 10;
			System.out.println(num);
		}
	}

}
