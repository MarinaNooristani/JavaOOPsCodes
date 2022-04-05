package com.syntax.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first number:");
		double num1 = scan.nextDouble();

		System.out.print("Enter an operator:");
		char operator = scan.next().charAt(0);

		System.out.print("Enter the second number:");
		double num2 = scan.nextDouble();
		
		double sum=num1 + num2;
		double sub=num1 - num2;
		double mult=num1 * num2;
		double div=num1 / num2;
		double operation=0.0;
		
		if (operator == '+') {
			operation=sum;
		} else if (operator == '-') {
			operation=sub;
		} else if (operator == '*') {
			operation=mult;
		} else if (operator == '/') {
			operation=div;
		}
		System.out.println(num1 + " " + operator + " " + num2 + "=" + operation);
	}
}

