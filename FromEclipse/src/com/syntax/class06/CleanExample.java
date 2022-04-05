package com.syntax.class06;

public class CleanExample {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 34;
		int num3 = 21;

		int largest = 0;

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		}
		System.out.println(largest);

	}

}
