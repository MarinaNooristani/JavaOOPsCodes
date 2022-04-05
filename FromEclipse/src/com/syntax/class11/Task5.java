package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// 5.Write a program to swap 2 numbers without a temporary variable?
		System.out.println("Before swapping");
		int a = 50;
		int b = 20;
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);

		System.out.println("__________________________");
		System.out.println("After swapping");
		a = a + b;// 70
		b = a - b;// 50
		a = a - b;// 20

		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);

	}

}
