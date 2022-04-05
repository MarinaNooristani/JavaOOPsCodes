package com.syntax.reviewclass1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 7;

		switch (day) {
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		}
		int a = 7 * 3 + 6 / 2 - 5;
		int b = 21 - 8 + a % 3 * 11;// 21-8=13+66
		System.out.println(a);
		System.out.println(b);

	}

}
