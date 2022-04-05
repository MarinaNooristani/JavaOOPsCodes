package com.syntax.class04;
import java.util.Scanner;//we need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);//creating Scanner
		
		System.out.println("Please enter your name");// program runs till here
		
		//if you want to capture a single string --> use next();
		
		String name=input.next();//type String and hit enter
		
		System.out.println("your name is "+name);
		
		//red button still running
		//if you want to capture int --> use nextInt();
		
		System.out.println(name+" please enter your age");
		
		int age=input.nextInt();//type integer and hit enter
		
		System.out.println("your name is "+name+" and your age is "+age);
		

	}

}
