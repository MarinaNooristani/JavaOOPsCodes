package com.syntax.class05;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = sc.nextInt();

		if (number >= 1 && number <= 10) {
			System.out.println(number + " is a small number");
		} else if (number >= 11 && number <= 100) {
			System.out.println(number + " is a medium number");
		} else if (number >= 101 && number <= 1000) {
			System.out.println(number + " is a large number");
		} else {
			System.out.println("Inavlid number");
		}

	}

}
