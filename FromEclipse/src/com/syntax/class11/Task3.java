package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// 3.Create a 2D array or integer type where you will store odd and even
		// numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] numbers = { { 3, 4, 1 }, { 2, 8, 5 }, { 1, 3, 8 }, { 7, 6, 9 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int element = numbers[i][j];
				if (element % 2 == 0) {
					System.out.println(element);
				}
			}
		}

	}

}
