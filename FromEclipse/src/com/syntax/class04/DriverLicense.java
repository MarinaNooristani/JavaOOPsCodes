package com.syntax.class04;

import java.util.Scanner;

public class DriverLicense {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age=inp.nextInt();
		if(age>=18) {
			System.out.println("you will be issued  a driver license");
		}else {
			System.out.println("Please get a learners permit");
		}
				

	}

}
