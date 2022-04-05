package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrAssignment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Today is:");
		String day = scan.next();
		if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class today");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("I have a manual testing class");
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("Today I have a review class");
		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("I have a Java class");
		} else {
			System.out.println("Invalid day");
		}

	}

}
