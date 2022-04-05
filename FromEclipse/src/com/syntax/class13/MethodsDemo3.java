package com.syntax.class13;

public class MethodsDemo3 {
	// int we specify the data type that method will return
	// squareTheNumber name of method
	// (int number) parameters of the method
	// return tell java what to return from this method

	int squareTheNumber(int number) {
		return number * number;
	}

	// task
	//we need to use else always
	String TeyfurHorse(String personName, String animalName) {
		if ("Teyfur".equals(personName) && "Horse".equals(animalName)) {
			return "camel";
		} else if ("Horse".equals(animalName)) {
			return "Horse";
		} else {
			return "any animal";
		}

	}

	public static void main(String[] args) {
		MethodsDemo3 obj = new MethodsDemo3();
		int result = obj.squareTheNumber(5);
		System.out.println(result);
		// task
		String output = obj.TeyfurHorse("Teyfur", "Horse");
		System.out.println(output);
		//
		System.out.println(obj.TeyfurHorse("Teyfur","Dog"));
		

	}

}
