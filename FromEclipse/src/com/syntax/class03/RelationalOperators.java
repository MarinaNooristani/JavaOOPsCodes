package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 16;
		System.out.println(num1 > num2);// false
		System.out.println(num1 == num2);// false
		System.out.println(num1 < num2);// true
		System.out.println(num1 != num2);// true

		// the result of relational operators will be always in boolean type

		boolean result = num1 == num2;
		System.out.println("Result is: " + result);// false

		System.out.println(num1 = num2);// reassign 16--> num1=16
		System.out.println(num1);//16
		System.out.println(num1 == num2);// comparing -->16==16

	}

}
