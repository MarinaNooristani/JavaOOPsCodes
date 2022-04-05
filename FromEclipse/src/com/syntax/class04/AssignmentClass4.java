package com.syntax.class04;

import java.util.Scanner;//import from library-->java-->jdk-->jre-->scanner

public class AssignmentClass4 {
    //nested if when one condition depends on other condition
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //first action in the right of assignment operator happen
		System.out.println("Do you have a credit card?");
		boolean credit=sc.nextBoolean();//string and IgnoreCase
		if(credit==false) {
			System.out.println("we offer you to get a credit card");
			
		}else {System.out.println("What is the balance on your card?");
		int balance=sc.nextInt();//double can also be used
		if(balance>1000) {
			System.out.println("you should pay it off");
		}else {
			System.out.println("you can spend more");
		}
			
		}

	}

}
