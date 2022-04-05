package com.syntax.class07;

public class LoopHw2 {

	public static void main(String[] args) {
		// HW#3

		for (int k = 20; k >= 2; k -= 2) {
			System.out.print(k + " ");
		}

		/************************/
		System.out.println("using if");

		for (int q = 20; q >= 1; q--) {
			if (q % 2 == 0) {
				System.out.println(q);
			}
		}
	}

}
