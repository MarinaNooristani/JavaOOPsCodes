package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		String mom = "Mary";
		String dad = "Daniel";
		String expectingBaby = "boy";
		String firstPart = "";
		String secondPart = "";
		if ("boy".equalsIgnoreCase(expectingBaby)) {
			firstPart = dad.substring(0, dad.length() / 2);// (0,3) 012 Dan
			secondPart = mom.substring(mom.length() / 2);
		} else if ("girl".equalsIgnoreCase(expectingBaby)) {
			firstPart = mom.substring(0, mom.length() / 2);
			secondPart = dad.substring(dad.length() / 2);// if size=odd 3/2=1.5 but
		}

		System.out.println("Suggested baby name: " + firstPart + secondPart);
	}

}
