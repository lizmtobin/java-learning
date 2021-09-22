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

        // Method 2
        
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false
        System.out.println(str3.equals(str4));  // output will be: true
	}

}
