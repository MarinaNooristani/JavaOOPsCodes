package com.syntax.class10;

public class ArrayTask {

	public static void main(String[] args) {
		//create an array and retrieve all elements in reverse order
		//we cannot go for enhanced loop for this task
		int[] numbers= {1,4,6,3,5};
		int size=numbers.length;//5
		for(int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("__________________________________");
		for(int i=size-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		System.out.println("__________________________________");
		//another way
		int[] number= {1,4,6,3,5};
		int sizes=number.length;//5
		
		for(int i=0; i<sizes; i++) {
			System.out.println(number[sizes-i-1]);
		}
		

	}

}
