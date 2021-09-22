package com.qa.datatypes;

public class ClassMembers {

		String name = "Bob";
		byte age = 18;
		double height;
		long studentId = (long)(Math.random()* 100);
		boolean highIq = false;
		
		public void doHomework() {
			System.out.println("I'm doing my homework");
	}

	public int addNumbers(int x, int y) {
		
		int z = x + y;
		System.out.println(z);
		return z;
	}
}
