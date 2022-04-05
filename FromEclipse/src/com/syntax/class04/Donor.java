package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		int age=23;
		if(age>=18) {
			System.out.println("You are eligible to donate blood");
			
			int weight=100;
					
			if(weight>110){
				System.out.println("eligible");
			}else {
				System.out.println("we can not accept such a patient");
			}
		}else {
			System.out.println("You are not eligible by age to donate blood");
		}

	}

}
