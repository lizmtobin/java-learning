package com.qa.datatypes;

public class DataTypes {
	
	public static void main(String[] args) {

		
//Primatives
		
	boolean amIHungry = false;
	boolean isJavaFun = true;
	
	//char
	//it's a single character
	//don't use "double quotes" for strings only 'single quotes'
	
	char b = 'b';
	char example = 0; //unicode allows numbers that are translated in the table
	
	//byte - range -128 - 127
	//8-bit -- 00000000 - cos the binary chain only has that amount of room for that combination of numbers
	
	byte byter = 10;
	
	//short - range -32768 - 32767
	//16 bit -- 00000000 00000000 (twice as many bits)
	
	short shorty = 300;
	
	//int -- big range
	
	int inty = 30000000;
	
	//long - 64 bit
	// end in capital L to tell compiler it is a long
	
	long longy = 49494949494L;
			
	//float - 32 bit
	//point to 7 digits
	//lowercase f at end to tell compiler it's a float
	
	float floaty = 39.7f;
	
	//double - 64 bit 
	//double the length of float
	//end in D for compiler
	
	double dubly = 30.57583947D;
	
	
//reference variable//
	
	//String - is a class which 
	
	String dogName = "Fido";
	
	String x = dogName.toLowerCase();
	
	System.out.println(x);
	
	}
}
