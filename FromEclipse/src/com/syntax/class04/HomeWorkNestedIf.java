package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkNestedIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of worked years");
		int year = input.nextInt();

		if (year >= 5) {
			System.out.println("You are eligible for bonus");

			System.out.println("Enter your annual salary");
			int salary = input.nextInt();

			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible for bonus");
		}

	}

}
