package com.syntax.class12;

public class Horse {
	// defining attributes
	String name;
	String breed;
	int age;
	double weight;

	// defining methods or behavior
	void run() {
		System.out.println(name + " is running");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void printCompleteInfo() {
		System.out.println("name = " + name);
		System.out.println("breed = " + breed);
		System.out.println("age = " + age);
		System.out.println("weight = " + weight);
	}

	public static void main(String[] args) {
		// creating,declaring,instantiating object
		// besh name of object,instance for Horse
		Horse besh = new Horse();
		// assigning value for the attributes
		// giving specific value
		// we are accessing the property name on object besh and setting its value
		besh.name = "spirit";
		besh.breed = "Stallion";
		besh.age = 20;
		besh.weight = 400;
		// calling the methods
		besh.run();
		besh.printCompleteInfo();
		// creating another object for Horse
		Horse myHorse = new Horse();
		myHorse.name = "Tuzik";
		myHorse.breed = "Mustang";
		myHorse.age = 15;
		myHorse.weight = 450;

		myHorse.run();
		myHorse.printCompleteInfo();

	}
}
