package com.syntax.class09;

public class ArrayHW3 {

	public static void main(String[] args) {
		int[] numbers = { 15, 45, 10, 32 };
		int size = numbers.length;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of all elements in the array = " + sum);
		// enhanced for loop
		sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum of all elements in the array = " + sum);
	}

}
