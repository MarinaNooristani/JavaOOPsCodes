package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		System.out.println("-------- DO WHILE CHECK CONDITION BEFORE EXECUTION----------");
		int num1 = 10;
		while (num1 < 3) {// is more used than do while
			System.out.println("Hello");
			num1++;
		}
		System.out.println("-------- DO WHILE CHECK CONDITION AFTER EXECUTION----------");
		int num2 = 10;
		do {
			System.out.println("Hello");
			num2++;
		} while (num2 <= 3);
		System.out.println("-------------------------");
		int num3 = 1;
		do {
			System.out.print(num3 + " ");
			num3++;
		} while (num3 <= 30);
	}

}
