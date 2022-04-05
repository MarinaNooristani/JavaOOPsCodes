package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			if (i == 2) {
				continue;// skip the current iteration/cycle and continue to the next iteration
			}
			System.out.println("i am code inside loop ");
		}
         //i want to print all the numbers from 1 till 10  except number 4 and number 7
		
		for(int i=1; i<=10; i++) {
			if(i==4 || i==7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
