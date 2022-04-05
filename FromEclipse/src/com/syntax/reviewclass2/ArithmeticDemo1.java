package com.syntax.reviewclass2;

public class ArithmeticDemo1 {

	public static void main(String[] args) {
		// + - * /
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 + num2);// 20
		
		String name1 = "Marina";
		String name2 = "Nooristani";
		System.out.println(name1 + name2);
		
		char letter1 = 'A';// 65
		char letter2 = 'B';// 66
		System.out.println(letter1 + letter2);// 131

		/********************************/
		System.out.println(num1 - num2);
		// System.out.println(name1-name2); not defined
		System.out.println(letter1 - letter2);// -1
		// System.out.println(num1-name1); not defined
		System.out.println((int) 'A');// to convert char into int

		/********************************/
		System.out.println(num1 * num2);
		// System.out.println(name1*name2); not defined
		System.out.println(letter1 * letter2);

	}

}
