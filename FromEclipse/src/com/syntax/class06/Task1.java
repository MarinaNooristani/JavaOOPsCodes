package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scan.next();

		String language;
		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;

		case "USA":
			language = "English";
			break;

		case "Russia":
			language = "Russian";
			break;
		/*
		 * case "Russia": 
		 *     language = "Russian"; 
		 *     break;
		 *  we cannot have duplicate cases
		 */

		case "Netharland":
			language = "Dutch";
			break;
		default:
			language = "Uknown language";
			break;

		}
		scan.close();
		System.out.println("you are from " + country + " and you speak " + language);

	}

}
