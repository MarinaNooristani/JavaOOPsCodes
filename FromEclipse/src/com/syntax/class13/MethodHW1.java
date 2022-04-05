package com.syntax.class13;

public class MethodHW1 {
	// 1.Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.
	void larger(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger");
		} else {
			System.out.println("numbers are the same");
		}
	}

	public static void main(String[] args) {

		MethodHW1 obj = new MethodHW1();
		obj.larger(45, 78);
		obj.larger(90, 78);
		obj.larger(45, 45);
	}

}
