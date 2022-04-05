package com.syntax.class13;

public class MethodHW3 {
	// 3.Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.
	void sayHello(String country) {
		String hello = null;
		switch (country) {
		case "Turkey":
			hello = "Merhaba";
			break;
		case "France":
			hello = "Bonjour";
			break;
		case "Italy":
			hello = "Ciao";
			break;
		}
		System.out.println(hello);
	}

	public static void main(String[] args) {
		MethodHW3 obj1 = new MethodHW3();
		obj1.sayHello("France");
		obj1.sayHello("Italy");

	}

}
