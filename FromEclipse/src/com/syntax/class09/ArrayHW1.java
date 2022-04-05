package com.syntax.class09;

public class ArrayHW1 {

	public static void main(String[] args) {

		String[] cars = new String[6];
		cars[0] = "Lamborghini";
		cars[1] = "BMW";
		cars[2] = "Ferrari";
		cars[3] = "Mercedes";
		cars[4] = "Porsche";
		cars[5] = "Range rover";

		int size = cars.length;
		System.out.println("Number of elements in cars:" + size);

		for (int i = 0; i < cars.length; i++) {// for loop
			System.out.println(cars[i]);
		}
		System.out.println("___________________________________");

		for (String car : cars) {// enhanced for loop or for each loop
			System.out.println(car);
		}
	}

}

