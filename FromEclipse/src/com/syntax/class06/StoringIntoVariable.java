package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quizScore=scan.nextInt();
		 
		System.out.println("Please enter your mid term score");
		int midtermScore=scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore=scan.nextInt();
		
		int average=(quizScore+midtermScore+finalScore)/3;
		char grade;
		 if(average>=90) {
			grade='A';
		 }else if(average>=70 && average<=90) {
			 grade='B';
		 }else if(average>=50 && average<=70) {
			 grade='C';
		 }else {
			 grade='F';
		 }
			 
		 System.out.println("your grade is "+grade);
			 

	}

}
