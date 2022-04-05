package com.syntax.class11;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		// 2.Create a 2D array of integer values. Print the sum of all numbers.
		// pseudo programming
		// 1)create the 2D array
		// 2)print the sum of all elements
		int[][] array2D = { { 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30 } };
		// print out the elements of an array without loop
		// System.out.println(Arrays.toString(array2D));
		for (int x = 0; x < array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x]));
		}
		System.out.println("_______________________");

		// sum of all elements
		int sum = 0;
		for (int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
			for (int j = 0; j < array2D[i].length; j++) {
				sum += array2D[i][j];
			}
		}
		System.out.println("The sum of all elements in the array is " + sum);

	}

}
