package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		String name = "Marin";
		if (!name.isEmpty()) {
			if (name.length() % 2 != 0 && name.length() >= 3) {
				System.out.println(name.charAt(name.length() / 2));
			}
		} else {
			System.out.println("String is empty");
		}

	}

}
