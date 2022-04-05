package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		String num = "111-222-1234";
		System.out.println(num.charAt(4));
		System.out.println(num.substring(4));// it starts from 4
		// System.out.println(num.substring(19)); error
		System.out.println(num.substring(4, 7));// 2 parameters starting point ending point
	}

}
