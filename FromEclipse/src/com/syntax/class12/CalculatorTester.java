package com.syntax.class12;

public class CalculatorTester {

	public static void main(String[] args) {
		Calculator simpleMathCalculator = new Calculator();
		simpleMathCalculator.add();
		// debug step into to see how the internal of add method works
		simpleMathCalculator.addNumbers(13, 80);// to pass different value
		simpleMathCalculator.addNumbers(78, 90);
		int number1 = 39;
		int number2 = 30;
		simpleMathCalculator.addNumbers(number1, number2);

	}

}
