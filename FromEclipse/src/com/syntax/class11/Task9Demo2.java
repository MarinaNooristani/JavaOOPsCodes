package com.syntax.class11;

import java.util.Arrays;

public class Task9Demo2 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int[] arr = { 10, 20, 90, 50, 70 };
		Arrays.sort(arr);// Arrays is a class
		System.out.println(Arrays.toString(arr));
		System.out.println("The first largest number in the array" + arr[arr.length - 1]);
		System.out.println("The second largest number in the array" + arr[arr.length - 2]);

	}

}
