package com.syntax.class08;

public class ForLoopTask1 {

	public static void main(String[] args) {
		//sum of all even and odd number from the range 1 to 50
		
		int sumEven = 0;
		for (int i = 2; i <= 50; i += 2) {
			sumEven += i;
		}
		System.out.println("Sum of all even numbers "+sumEven);
		
		int sumOdd = 0;
		for (int i = 1; i <= 50; i += 2) {
			sumOdd += i;
		}
		System.out.println("Sum of all odd numbers "+sumOdd);
	}

}
