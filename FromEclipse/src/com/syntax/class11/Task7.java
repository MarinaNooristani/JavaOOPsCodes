package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		// 7.Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 1 2 3 5 8 13 21...
		// 0 1 2 3 4 5 6 ... index
		int howMany = 10;
		int previous = 1;
		int current = 2;
		int next = 0;
		System.out.print(previous + " ");
		System.out.print(current + " ");
		for (int i = 0; i < howMany - 2; i++) {
			next = previous + current;
			System.out.print(next + " ");
			previous = current;
			current = next;
		}
	}

}
