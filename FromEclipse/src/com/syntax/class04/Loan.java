package com.syntax.class04;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of loan you need?");
		int loan=scan.nextInt();
		if(loan<=200000){
			System.out.println("you are eligible for loan");
			
		}else {
			System.out.println("Sorry you are not eligible");
		}

	}

}
