package com.syntax.reviewclass6;

public class PatternsTask {

	public static void main(String[] args) {
		for (int r = 5; r >= 1; r--) {
			for (int c = 1; c <= 4; c++) {// i don't care about columns i have 4 columns
				System.out.print(r + " ");
			}
			System.out.println();
		}
		System.out.println("_____________");
		// *****
		// *   *
		// *   *
		// *****
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 5; c++) {
				if (r == 1 || r == 4 || c == 1 || c == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("_____________________");
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {//columns have a dependency on rows
				System.out.print(r+" ");
			}
			System.out.println("");
		}
		//homework

	}

}
