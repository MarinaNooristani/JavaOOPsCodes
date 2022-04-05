package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndHomeWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("In:");
		int day = input.nextInt();

		if (day >= 1 && day <= 5) {//we can use or operator here as well
			System.out.println("It's a weekday.");
		} else if (day == 6 || day == 7) {//we can use and operator as well else if (day >= 6 && day <= 7) 
			System.out.println("It's weekend");
		} else {
			System.out.println("Invalid day");
		}
	}

}
