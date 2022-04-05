package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// 1.Create an array on integer values using a scanner and calculate the sum of
		// all stored elements in that array.
		// pseudo code
		// run the code in each step
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Size of the array " + size);
		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter the element for index " + i);
			array[i] = scan.nextInt();
		}
		// print out the elements of an array without a loop
		System.out.println(Arrays.toString(array));

		int sum = 0;
		for (int j = 0; j < size; j++) {
			sum += array[j];// watch array[j]
		}
		System.out.println("The sum of all elements in the array is " + sum);

	}

}
