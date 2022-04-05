package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 5) {//6<=5 condition become false then java exits the loop or cannot enter block of code
			System.out.println(i);
			i++;
		}
		System.out.println("The value of i outside of while loop = " + i);// 6
		System.out.println("The End");
       /*******************************************/
		int j = 2;

		while (j <= 20) {
			System.out.print(j+" ");//print in the same line
			j++;
		}
		System.out.println("The End");
		/*******************************************/
		int c=20;
		
		while(c>=1) {
			System.out.print(c+" ");
			c--;
		}

	}

}
