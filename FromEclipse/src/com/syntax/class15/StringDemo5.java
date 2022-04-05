package com.syntax.class15;

public class StringDemo5 {

	public static void main(String[] args) {
		String name = "How are you guys @";//we can use \"
		// System.out.println(name.charAt(0));
		for (int i = 0; i < name.length(); i++) {

			if (i == (name.length() - 1)) {
				break;
			}
			System.out.println(name.charAt(i));
		}

	}

}
