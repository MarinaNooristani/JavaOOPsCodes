package com.syntax.class06;

public class SwitchLimitation {

	public static void main(String[] args) {
		// String, byte, short, int, char
		//long double float boolean can not be used in switch
		
		/*
		 * - Cannot switch on a value of type boolean. Only convertible int values,
		 *  strings or enum variables are permitted
		 *  boolean happy=true;
		 *  switch(happy) {}
		 */
		
		/*
		 *  Cannot switch on a value of type double. Only convertible int values, 
		 *  strings or enum variables are permitted
		 *  double number=10.00;
		switch(number) {}
		 */
		//relational and logical operators are not allowed
		//switch only checks for equality

	}

}
