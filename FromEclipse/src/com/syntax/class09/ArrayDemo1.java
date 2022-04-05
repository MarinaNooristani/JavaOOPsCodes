package com.syntax.class09;

public class ArrayDemo1 {

	public static void main(String[] args) {
		String[] cities = { "Washington", "Miami", "Los Angeles", "New york" };
		// if value is Miami--> I want to live in Miami
		
		int size = cities.length;
		for (int i = 0; i < size; i++) {
			System.out.print(cities[i] + " ");

			if (cities[i].equals("Miami")) {
				System.out.println("I want to live in Miami");
			}
		}

	}

}
