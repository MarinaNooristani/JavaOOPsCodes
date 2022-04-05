package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		String name = "Marina";
		String lastName = "Nooristani";
		char grade = 'A';
		String city = "Ankara";
		String country = "Turkey";
		long phoneNumber = 12371834234L;
		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am " + grade + " student");
		System.out.println("I live in " + city + "," + country);
		System.out.println("And my phone number is " + phoneNumber);
		city = "Madrid";// reassign
		country = "Spain";
		phoneNumber = 43837647212L;
		grade = 'B';
		System.out.print("My name is " + name + " and I moved to " + city + "," + country + ".");
		System.out.println("My new phone number is " + phoneNumber);
		//package--> show in--> system explorer package are folders
		//what is something that we are learning why we need them and when we need them

	}

}
