package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// if you have an array you can use for each loop to iterate/loop through the
		// entire array
		String[] cities = { "Washington", "Miami", "Los Angeles", "New york" };
		for (String city : cities) {// for enhanced loop
			System.out.println(city);
		}
		System.out.println("----------------------------------");
		int[] numbers = { 10, 20, 30, 40 };
		for (int num : numbers) {// for each loop:for each element inside this array
			System.out.print(num + " ");

		}
		System.out.println("------------------------");
		char[] grades = { 'A', 'B', 'C', 'D' };
		for (char grade : grades) {
			System.out.print(grade + " ");
		}
		System.out.println("------------------------");
		String[] countries = new String[5];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Morroco";
		countries[4] = "Turkey";
		for (String country : countries) {
			System.out.println(country);
		}
	}

}
