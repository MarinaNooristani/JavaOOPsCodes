package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 30) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Another Way");
		int d = 2;
		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}
	}

}
