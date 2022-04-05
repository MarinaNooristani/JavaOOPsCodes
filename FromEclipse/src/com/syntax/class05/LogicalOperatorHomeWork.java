package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorHomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height");
		double height = scan.nextDouble();//int can be used also
		if (height < 60) {
			System.out.println("Short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("medium");
		} else if (height > 72) {
			System.out.println("tall");
		}

	}

}
