package com.qa.datatypes;

public class Operators {

	public void remainder(int x, int y) {
		int z = x % y;
		System.out.println("The modulos of" + x +"and" + y + "is:" z);
	}
	
	public static void main(String[] args) {
		remainder(3,5);
	}
}
