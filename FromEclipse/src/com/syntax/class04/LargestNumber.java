package com.syntax.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter 3 Number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is the largest number");
			}else {
				System.out.println(num3+" is the largest number");
			}
		}else {//num2>num1 assuming
			if(num2>num3) {
				System.out.println(num2+" is the largest number");
			}else{
				System.out.println(num3+" is the largest number");
			}
		}

	}

}
