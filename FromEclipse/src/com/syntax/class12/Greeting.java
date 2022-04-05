package com.syntax.class12;

public class Greeting {

	void SayHello(String name) {
		System.out.println("Hello " + name);
	}
	// parameters inside parenthesis
	// to print 5 times we use loop

	void sayHello5Times(String name) {// hard code
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " + name);
		}
	}

   //
	void sayHelloManyTimes(String name, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello " + name);
		}
	}

	public static void main(String[] args) {

		Greeting greet = new Greeting();
		greet.SayHello("Marina");
		greet.sayHello5Times("Teyfur");
		greet.sayHelloManyTimes("Emilia", 3);

	}

}
