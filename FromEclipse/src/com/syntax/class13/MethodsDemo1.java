package com.syntax.class13;

public class MethodsDemo1 {
	//void is a type of method that does not return anything when called
	//takes information and print it in console 
	//checkEvenOdd is the name of the method
	//() we use to pass information from outside
	//int number this is parameter that we can pass to this method when called
	//
	
//1
	void checkEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
//2
	void weather(boolean rain) {
		if (rain) {
			System.out.println("i will not go for a walk");
		} else {
			System.out.println("i will  go for walk");
		}

	}
//3
	void checkName(String name) {
		if ("Teyfur".equals(name)) {
			System.out.println("memer");
		} else if ("Maha".equals(name)) {
			System.out.println("doctor");
		} else {
			System.out.println("Lets focus on class");
		}
	}

	public static void main(String[] args) {
		MethodsDemo1 object1 = new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.weather(true);
		object1.checkName("Teyfur");

	}

}
