package com.syntax.class07;

public class LoopOddNumbers {

	public static void main(String[] args) {
		int i=100;
		while(i>=1) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i--;
		}
		int j=99;
		while(j>=1) {
			System.out.print(j+" ");
			j-=2;
		}
       
	}

}
