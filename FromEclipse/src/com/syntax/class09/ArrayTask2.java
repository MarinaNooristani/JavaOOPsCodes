package com.syntax.class09;

public class ArrayTask2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		String[] names=new String[8];
		names[0]="Lily";
		names[1]="Moreed";
	    names[2]="Francisco";
	    names[3]="Reza";
	    names[4]="Marina";
	    names[5]="Dmitriy";
	    names[6]="Shiva";
	    names[7]="Tristan";
	    System.out.println(names[4]);
	    System.out.println("----------------------------------------------");
	    String[] namess= {"Lily","Moreed","Francisco","Reza","Marina","Dmitriy","Shiva","Tristan"};
	    System.out.println(namess[4]);

	}

}
