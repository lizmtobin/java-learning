package com.qa.datatypes;

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phy = 75;
		int chem = 75;
		int bio = 75;
		int sum = eachExam(phy, chem, bio);
		int grade = percent(sum);
		System.out.println(percent(sum));
		System.out.println(pass(grade));
	}
	
	public static int eachExam(int phy, int chem, int bio) {
		int sum = phy + chem + bio;
		return sum;
	}
	
	public static int percent(int sum) {
		 return (sum * 100)/450 ;
	}
	
	public static String pass(int grade) {
		if(grade < 60) {
			return "You failed this time";
		} else {
			return "You passed";
		}
	}
}