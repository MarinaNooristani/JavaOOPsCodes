package com.syntax.class13;

public class MethodHW5 {
	// 5.Write a method to return whether given number is prime or not?
	boolean isPrime(int number) {
		boolean isPrime=true;
		
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {//number<1
			isPrime=false;
		}
		
		return isPrime;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Write a method to return whether given number is prime or not?
		 */

		MethodHW5 objectName=new MethodHW5();
		System.out.println(objectName.isPrime(12));
		
		
	}

}
