package com.syntax.class04;

import java.util.Scanner;

//ctrl+shift+o cmd+shift+o
public class TakeInput {

	public static void main(String[] args) {
		//1. create a Scanner and assign to a variable
		 Scanner scan=new Scanner(System.in);
		 
		 //2. specify instructions
		 System.out.println("Please enter your country where are you from");
		 
		 //3.we need to capture string value -->use next();
		 String country=scan.next();//my code is waiting here
		 System.out.println("you are from "+country);
		 
		 //if you are from USA --> you speak English
		 //if you are from France --> you speak French
		 if(country.equalsIgnoreCase("USA")) {
			 System.out.println("you speak English");
		 }else if(country.equals("France")) {
			 System.out.println("you speak French");
		 }else {
			 System.out.println("i don't know which language you speak");
		 }
		 
		 

	}

}
