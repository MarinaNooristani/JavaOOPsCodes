package com.syntax.class05;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		// next() and nextLine()

		Scanner scan = new Scanner(System.in);
		System.out.println("using next");
		String value = scan.next();// nextBoolean(); nextDouble(); nextInt(); next().charAt(0);
		System.out.println(value);
		
		scan.nextLine();//resolve skipping
		
		System.out.println("using nextLine");
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		
	}

}
