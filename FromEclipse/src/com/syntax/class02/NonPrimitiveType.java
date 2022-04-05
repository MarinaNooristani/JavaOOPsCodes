package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		// all keywords start with a lower case
		// string is a built-in class not keyword
		String name = "Marina";
		String lastName = "Nooristani";
		long phoneNumber = 913242545353L;
		String mobileNumber = "3194284020492";
		// int num="121"; ERROR
		String num = "121";
		int num1 = 121;

		String greeting = "Hello world!";
		System.out.println(greeting);

		// Syso+ctrl+space -->autocomplete print statement
		System.out.println(name);
		System.out.println(lastName);

		System.out.println(name + " " + lastName);// we can use single quote as well
		/*
		 * using + we can concatenate
		 * String + String 
		 * String + int 
		 * String + boolean
		 * String + double, char......
		 */
		int age = 21;
		// Marina is 21 years old
		System.out.println(name + " is " + age + " years old");
		String address = "123 Test street";
		// i live on 123 Test street
		System.out.println("I live on " + address);
		String feeling = "like";
		String food = "kebab";
		// i like kebab
		System.out.println("I " + feeling + " " + food);
		feeling = "love";
		food = "shrimp";
		System.out.println("I " + feeling + " " + food);// white spaces outside double quotes
	}

}
