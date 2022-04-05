package com.syntax.class12;

public class Dog {
	// defining how dogs can look like with the help of
	// attributes,fields,properties,variables
	// in a class
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;

	// defining behaviors,functions,methods
	void bark() {
		System.out.println("Dog is barking...");
	}

	void eat() {
		System.out.println("Dog is eating...");
	}

	void sleep() {
		System.out.println("Dog is sleeing...");
	}

	public static void main(String[] args) {
		// Scanner scan=new Scanner(System.in); so we following the same pattern
		// creating an object oscar from class Dog
		Dog oscar = new Dog();
		// Dog is a class
		// oscar is an object
		// = assignment operator
		// new is a keyword that we use to create the object of the class
		// Dog() we are calling the constructor of the class

		// calling the behavior,method
		oscar.bark();
		oscar.sleep();
		oscar.eat();

	}

}
