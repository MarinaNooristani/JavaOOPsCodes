package com.syntax.class04;

import java.util.Scanner;

public class ThirdAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Where do you live?");
		String city=sc.nextLine();//los angles
		System.out.println("what is the temperature?");
		
		int fahr=sc.nextInt();//we can use double also
		sc.close();
		int celsius=((fahr-32)*5)/9;
		System.out.println("the temperature in "+city+" is "+celsius);
        
	}

}
