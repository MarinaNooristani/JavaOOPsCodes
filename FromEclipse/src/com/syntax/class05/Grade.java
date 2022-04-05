package com.syntax.class05;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quizScore=scan.nextInt();
		 
		System.out.println("Please enter your mid term score");
		int midtermScore=scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore=scan.nextInt();
		
		int average=(quizScore+midtermScore+finalScore)/3;
		 if(average>=90) {
			 System.out.println("grade=A");
		 }else if(average>=70 && average<=90) {
			 System.out.println("grade=B");
		 }else if(average>=50 && average<=70) {
			 System.out.println("grade=C");
		 }else if(average<50) {
			 System.out.println("grade=F");
		 }
			 
		 

	}

}
