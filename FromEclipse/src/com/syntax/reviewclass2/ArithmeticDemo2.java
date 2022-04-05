package com.syntax.reviewclass2;

public class ArithmeticDemo2 {

	public static void main(String[] args) {
		// + - * /
		int num1 = 10;
		int num2 = 3;

		double num3 = 10;
		double num4 = 3;
		
		float num5 = 10;
		float num6 = 3;
		
		System.out.println(num1 / num2);
		System.out.println(num3 / num4);
		System.out.println(num5/num6);
		
		String name1 = "Marina";
		String name2 = "Nooristani";
		//System.out.println(name1 / name2); undefined
		
		char letter1 = 'A';// 65
		char letter2 = 'B';// 66
		System.out.println(letter1 / letter2);
		
		float f=3.4f;
		if(f==3.4) {
			System.out.println("Magic");
		}else {
			System.out.println("Simple math");
		}
		//for whole number always use int
		//for decimal number always use double

	}

}
