package com.syntax.class08;

import java.util.Scanner;

public class BreakTask {

	public static void main(String[] args) {
		/*
		 * create a program that will keep asking the user to apply for a credit card.
		 * as soon you get "yes" from a user program should stop asking
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String answerYes = "yes";
		String answer;

		do {
			System.out.println("Please apply for credit card");
			answer = scan.next();
		} while (!answer.equalsIgnoreCase(answerYes));// we can put only yes without storing it inside a variable("yes")
		System.out.println("congrats");
		scan.close();
	}
}
