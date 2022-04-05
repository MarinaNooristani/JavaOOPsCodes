package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		// +, -, *, /, %
		int num = 100;
		num = num + 100;// = is assignment operator and reassigning
		System.out.println(num);// 200
		num += 100;// add 100 to my variable
		System.out.println(num);// 300
		num -= 20;
		System.out.println(num);// 280
		num /= 10;
		System.out.println(num);// 28
		num %= 2;
		System.out.println(num);// 0

	}

}
