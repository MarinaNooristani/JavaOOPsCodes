package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
		//sum of all even and odd numbers from the range 1 to 50
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {//else if(i%2!=0)
				sumOdd+=i;
			}
			
		}
		System.out.println("Sum of all even numbers = "+sumEven+" and sum of all odd numbers = "+sumOdd);
		
	}

}
