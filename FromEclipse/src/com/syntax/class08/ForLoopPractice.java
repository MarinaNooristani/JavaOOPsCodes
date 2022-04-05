package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello " + i);
		}

		System.out.println("    MULTIPLICATION TABLE   ");

		/*
		 * 3 X 1=3 
		 * 3 X 2=6 
		 * 3 X 3=9
		 * 
		 * 
		 * 3 X 10=30
		 * 
		 */
		int num = 7;
		int result;
		for (int j = 1; j <= 10; j++) {
			result = num * j;
			System.out.println(num+" X "+j+" = "+result);
		}

		System.out.println("  WHAT IS THE OUTPUT  ");
		
		for(int k=0; k<=10; k+=3) {
			System.out.print(k+" ");
		}
		
		System.out.println("  WHAT IS THE OUTPUT  ");
		
		int sum=0;
		for(int p=1; p<=5; p++) {
			sum+=p;
			System.out.println(sum);
		}
		//System.out.println(sum);
		
		System.out.println("  WHAT IS THE OUTPUT  ");
		
		int value=1;//0
		for(int i=1; i<4; i++) {//i=0
			value*=i;
		}
		System.out.println(value);
	}

}
