package com.syntax.class07;

import java.util.Scanner;

public class LoopHw5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter your name");
			String name = scan.next();
			System.out.println("Please enter your last name");
			String lastName = scan.next();
			System.out.println("Please enter your age");
			int age = scan.nextInt();

			System.out.println("Your name is " + name + " " + lastName + " and you are " + age + " years old");
		}

	}

}
