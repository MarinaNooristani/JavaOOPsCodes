package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		/*
		 * create a variable and assign value
		 * 
		 * declare a variable and initialize
		 */
		// Java runs the code top to the bottom left to the right
		// 1
		int age = 21;// left side declaration and right side initialization
		// 2
		int num;// declare variable
		num = 10;// initialize it
		num = 100;// reassign the value
		// 3
		int n1, n2, n3;// all 3 variables are on the int type
		n1 = 10;// n1 is an identifier
		n2 = 20;
		n3 = 30;
		// ctrl+d--> will remove entire line
		// can i change a value of the variable?
		age = 26; // reassigning the value of variable age
		System.out.print(age);
		// age=26.9; ERROR DECIMAL NUMBER
		// int age=26; ERROR ONCE DECLARED
		// keywords are special reserved words that have a meaning to java
		// we can not use it as name for class variables.....

		// Java rules for identifiers
		// char 1charac='A';ERROR do not start identifier with numbers
		// double %n=12.9; ERROR do not use symbols
		// do not use keywords as identifiers
		// Java allows to use _OR $ as identifier
		double $num = 12.9;
		double _value = 12.3;
		char charac1 = 'A';
		boolean Break = true;

		// not rule ,but we prefer to follow

		/*
		 * variables and method names should start with lowercase give variable a
		 * meaningful name
		 * 
		 * class name should start with upper case
		 * 
		 * if name has 2 or more words--> follow camel casing
		 * 
		 */
		int bigNumber = 1344;
		// ctrl+"+" ctrl+"-"
		// ctrl+shift+f

	}
}
