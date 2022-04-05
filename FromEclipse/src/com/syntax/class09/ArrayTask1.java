package com.syntax.class09;

public class ArrayTask1 {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array)
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		System.out.println("---------------------------------");
		char[] gradess= {'A','B','C','D','E','F'};
		System.out.println(gradess[1]);
		//System.out.println(gradess[2]);
		//System.out.println(gradess[3]);can use loop to avoid repetitive code
		
		int size=gradess.length;
		System.out.println("Number of elements is "+size);
		
		//for loop
		for(int i=0; i<gradess.length; i++) {//can use <= because of index and we don't have that element number
			System.out.print(gradess[i]+" ");
		}
		
		

	}

}
