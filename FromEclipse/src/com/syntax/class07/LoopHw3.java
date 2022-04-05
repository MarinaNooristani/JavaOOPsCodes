package com.syntax.class07;

public class LoopHw3 {

	public static void main(String[] args) {
		System.out.println("using if inside loop");
		for (int p = 20; p >= 1; p--) {
			if (p % 2 != 0) {
				System.out.println(p);
			}
		}
		System.out.println("Another way");
		/************************/

		for (int q = 19; q >= 1; q -= 2) {
			System.out.println(q);
		}

	}

}
