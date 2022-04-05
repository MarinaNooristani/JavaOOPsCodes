package com.syntax.class07;

import java.util.Scanner;

public class LoopHw4 {

	public static void main(String[] args) {
		double coffeePrice = 3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for the coffee");

		double guessAmount;
		do {
			guessAmount = scan.nextInt();
			if(guessAmount>coffeePrice) {
				System.out.println("Please give less");
			}else if(guessAmount<coffeePrice) {
				System.out.println("please give more money");
			}
			
		} while (guessAmount != coffeePrice);
		System.out.println("Enjoy your coffee");

	}

}
