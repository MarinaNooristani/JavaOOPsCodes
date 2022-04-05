package com.syntax.class09;

public class ArrayHW2 {

	public static void main(String[] args) {
		String[] animals = new String[5];
		animals[0] = "Horse";
		animals[1] = "Giraffe";
		animals[2] = "Lion";
		animals[3] = "Bear";
		animals[4] = "Tiger";

		int size = animals.length;

		for (int i = 0; i < size; i++) {// for loop
			System.out.println(animals[i]);
		}
		System.out.println("___________________________________");

		for (String animal : animals) {// enhanced for loop or for each loop
			System.out.println(animal);
		}

	}

}
