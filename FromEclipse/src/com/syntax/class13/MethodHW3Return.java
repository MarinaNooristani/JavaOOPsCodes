package com.syntax.class13;

public class MethodHW3Return {

	// 3.Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.

	String sayHello(String country) {
		// and we can have a variable for storing hello here and use break keyword in
		// switch statement and then return once that variable

		switch (country) {
		case "Turkey":
			return "Merhaba";
		// break; we can not use break here
		case "France":
			return "Bonjour";

		case "Italy":
			return "Ciao";
		default:// always default with return
			return "Heyyy";
		}
	}

	public static void main(String[] args) {
		MethodHW3Return obj1 = new MethodHW3Return();
		String hello = obj1.sayHello("France");
		System.out.println(hello);

	}

}
