package com.syntax.class12;

public class Calculator {
	//sometimes there would be thousand line of codes so we can use 2 classes
	//parameters
	
   void add() {
	   int number1=10;//hard code
	   int number2=10;
	   System.out.println(number1+number2);
   }
   void addNumbers(int number1,int number2) {//to reuse the code
	   System.out.println(number1+number2);
   }
}
