package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the temperature");
		int temp = scan.nextInt();
		System.out.println("the temperature is " + temp);

		scan.nextLine();//resolve skipping

		System.out.println("please enter your city");
		String city = scan.nextLine();
		System.out.println(city);

	}

}
