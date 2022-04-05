package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Task 1");

		int a = 1;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println("Task 2");

		int b = 100;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		System.out.println("Task 3");
		
		//print even numbers 

		int c = 20;
		while (c <= 100) {
			System.out.print(c + " ");
			c += 2;
		}
		/****************************/
		System.out.println("using if");
		int d=20;
		while(d<=100) {
			if(d%2==0) {
				System.out.print(d+" ");
			}
			d++;
		}

	}

}
