package com.syntax.reviewclass6;

public class Patterns {

	public static void main(String[] args) {
		// *****
		// *****
		// *****
		// *****
		for (int i = 1; i <= 4; i++) {
			System.out.print("*****");
			System.out.println("");
		}
		System.out.println("___another way___");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("________ better way_______");
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("10 X 10 Square");
		for(int r=1; r<=10; r++) {
			for(int c=1; c<=10; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("________________________");
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("________________________");
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}

	}

}
