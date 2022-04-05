package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		// 8.Maximum and minimum number in the array?

		int[] numbers = { 10, 20, 90, 50, 70 };
		// assuming first number is the largest number
		int max = numbers[0];
		// assuming first number is the smallest number
		int min = numbers[0];
		// iterating through all the elements
		for (int number : numbers) {
			// checking if we have something even bigger if yes update the largest
			if (number > max) {
				max = number;
			}
			// checking if we have something even smaller if yes update the smallest
			if (number < min) {
				min = number;
			}
		}
		System.out.println("Largest number is " + max);
		System.out.println("smallest number is " + min);
	}

}
