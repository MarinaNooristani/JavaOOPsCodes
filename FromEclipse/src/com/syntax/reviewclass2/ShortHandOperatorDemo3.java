package com.syntax.reviewclass2;

public class ShortHandOperatorDemo3 {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(++number + (++number) + number++);// 11+12+12=35
		System.out.println(number);// 13
		/**************************/
		number = 10;
		System.out.println(++number + number++);
		System.out.println(number);

	}

}
