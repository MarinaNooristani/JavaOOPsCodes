package com.syntax.class04;

public class BuyHouse {

	public static void main(String[] args) {
		double mortgageRate = 3.5;// outer condition
		int mortgagePrice = 70000;// nested if condition
		
		if (mortgageRate > 4.5) {
			System.out.println("You can not buy a house");
			
		} else {
			System.out.println("You can buy a house");
			
			if (mortgagePrice > 50000) {
				System.out.println("You should take a loan");
				
			} else {
				System.out.println("You can pay cash");
			}
		}

	}

}
