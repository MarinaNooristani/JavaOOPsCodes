package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		// interview question
		// Create a String and print it in reverse order (Sunday yadnuS).
		String day = "Sunday";
		int size = day.length();
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}
	}

}
