package com.syntax.class09;

public class Recap {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println("A");
			// break; 1 time A continue; 4 times A
			System.out.println("B");
		}

		System.out.println("-----------------------------------------");
		for (int i = 1; i <= 3; i++) {// outer loop
			for (int j = 1; j <= 3; j++) {// j>=3 inner loop j-- INFINITE HELLO
				System.out.println("Hello");// 1 Hello
				break;// only exits inner loop and resets for the next iteration
			}
			System.out.println("Good Morning");// gets printed 3 GM
		}

		System.out.println("-----------------------------------------");
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				System.out.println("Hello");// 3 Hello
			}
			System.out.println("Good Morning");// 1 Good Morning
			break;
		}

		System.out.println("-----------------------------------------");
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				System.out.println("Hello");// 1 Hello
				break;
			}
			System.out.println("Good Morning");// 1 Good Morning
			break;
		}
		System.out.println("-----------------------------------------");
		for (int i = 0; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {
				// continue; java goes back goes back and the code below would be never
				// reachable
				System.out.println("Good Morning");// 4 times 4 times
				continue;
			}
			System.out.println("Hello");// 1 time 1 time
			}
			System.out.println("-----------------------------------------");
			
			for (int i = 1; i <= 3; i++) {
				if (i == 1) {
					continue;
				}

				for (int j = 1; j <= 2; j++) {
					if(j==2) {
						break;
					}
					
					System.out.println("Good Morning");

				}
				System.out.println("Hello");

			}

		

	}
}
