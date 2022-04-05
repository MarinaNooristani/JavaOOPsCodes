package com.syntax.class13;

public class MethodHW2 {
	// 2.Create a method that will take a number and prints whether the number is
	// even or odd.
	void checkNumber(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

	public static void main(String[] args) {

		MethodHW2 object = new MethodHW2();
		object.checkNumber(20);
	}

}
