package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		
		boolean hungry=true;
		//if(hungry) we can do like this as well because it is a boolean
		if(hungry==true) {
			System.out.println("I am going to eat");
		}
		else {
			System.out.println("i am going to drink tea");
		}
		//boolean does not need a relational operator
		boolean traffic=true;
		if(traffic) {
			System.out.println("I am coming home late");
		}
		else {
			System.out.println("No traffic,I am on time");
		}
		/*
		 * 
		 */
		String browser="chrome";
		//if(browser)- Type mismatch: cannot convert from String to  boolean
		//always use equals to compare 2 strings
		if(browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");
		}
		else {
			System.out.println("we are not executing any test cases");}
			//would work but not preferable
			if(browser=="chrome") {
				System.out.println("we are executing tests on chrome");
			}
			else {
				System.out.println("we are not executing any test cases");
		}
	}

	}
