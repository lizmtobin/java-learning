package com.qa.string;

public class StringDemo {

	public static void main(String[] args) {
		// Method 1
		String strLiteral = "Hello World";
		System.out.println(strLiteral);
		
		//Method 2
		String strObject = new String("Hello World!");
		System.out.println(strObject);
		
		//Method 1
		String str1 = "I like strings";
        String str2 = "I like strings";
        System.out.println(str1 == str2); // output will be: true

        // Method 2 /// equal for two identical string objects
        
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false
        System.out.println(str3.equals(str4));  // output will be: true
        
        //Making strings from array
        
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
        String helloString = new String(helloArray);  
        System.out.println(helloString); // prints out Hello.
        
        //Checking length
        String myStr = "I like strings";
        int stringLength = myStr.length();
        System.out.println("String Length is " + stringLength);
        // output will be: String Length is 14
        
        //concatination 
        
        String myStr3 = "My cat's name is ".concat("Copycat");
        System.out.println(myStr3);
        // output will be: My cat's name is Copycat

        //example 2
        String myStr8 = "Hello, " + "World" + "!" ;
        System.out.println(myStr8);
        // output will be: Hello, World!

        //example 2.5
        String myStr5 = "Hello, "+ "World" + "!";
        System.out.println(myStr5);
        //output will be: Hello, World!

        //example 3
        String string1 = "Welcome ";
        String string2 = "to ";
        String string3 = "Java";
        String string4 = "!";
        System.out.println(string1 + string2 + string3 + string4);
        // output will be: Welcome to Java!
        
	}

}
