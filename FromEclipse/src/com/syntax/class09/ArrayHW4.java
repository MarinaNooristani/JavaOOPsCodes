package com.syntax.class09;

public class ArrayHW4 {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0] = 12;
		numbers[1] = 34;
		numbers[2] = 87;
		numbers[3] = 65;

		int largestNumber = 0;
		if (numbers[0] > numbers[1] && numbers[0] > numbers[2] && numbers[0] > numbers[3]) {
			largestNumber = numbers[0];
		} else if (numbers[1] > numbers[0] && numbers[1] > numbers[2] && numbers[1] > numbers[3]) {
			largestNumber = numbers[1];
		} else if (numbers[2] > numbers[0] && numbers[2] > numbers[1] && numbers[2] > numbers[3]) {
			largestNumber = numbers[2];
		} else if (numbers[3] > numbers[0] && numbers[3] > numbers[1] && numbers[3] > numbers[2]) {
			largestNumber = numbers[3];
		}
		System.out.println(largestNumber + " is the largest number.");

		System.out.println("another way");
		int[] number = { 34, 12, 56, 10 };
		int largest = number[0];// assume

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {// comparing
				largest = number[i];
			}

		}
		System.out.println(largest);

		System.out.println("using enhanced for loop");
		largest = number[0];
		for (int num : number) {
			if (num > largest) {
				largest = num;
			}

		}
		System.out.println(largest);

	}

}
