package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		String userName = "LILLY";
		String password = "Lilly1234";

		if ("Lilly".equals(userName) && "Lilly123".equals(password)) {
			System.out.println("Welcome back");
		} else {
			System.out.println("Username or password is not correct");
		}
		// some websites don't care about lower case or upper case for the user name
		if ("Lilly".equalsIgnoreCase(userName) && "Lilly123".equals(password)) {
			System.out.println("Welcome back");
		} else {
			System.out.println("Username or password is not correct");
		}
	}

}
