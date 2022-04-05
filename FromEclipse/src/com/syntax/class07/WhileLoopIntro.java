package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time = 7;
		if (time <12) {
			System.out.println("Morning");
		}//if the condition is true java executes once the block of code and exit block of code
		/******************************/
		while (time < 12) {// if time > 12 no output
			System.out.println("Morning");
			time++;//
		}
		System.out.println();
	}//repeat the block of code until the condition becomes false

}
