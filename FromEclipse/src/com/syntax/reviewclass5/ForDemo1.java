package com.syntax.reviewclass5;

public class ForDemo1 {

	public static void main(String[] args) {
		int x = 0;
		for (System.out.println("1"); x < 5; System.out.println("3")) {
			System.out.println("Batch 12 is the best");
			x++;// 5 times
		}
		// prints 1 only executed once
		// checks condition
		// prints batch 12...
		// prints 3
		// checks condition
		// prints batch 12...
		// prints infinite time if we dont use increment operator

	}

}
