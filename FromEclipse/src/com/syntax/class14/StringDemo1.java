package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		// 2 ways
		String name = "MARINA";// always use shorter way
		String name2 = new String("Marina  ");// spaces are also counted as character
		String lastName = "Nooristani";
		
		// .length() built in string method return type is int
		System.out.println(name.length());
		System.out.println(name2.length());
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		// name=null; + does concatenate but concat method shows error
		System.out.println(name + lastName);// always use this one
		System.out.println(name.concat(lastName));// instead of + we can use this method
		
		//name=""; true
		//name="   "; false isEmpty() cares about spaces 
		System.out.println(name.isEmpty());//false 
		//name="   ";true for isBlank does not cares about spaces 
		//System.out.println(name.isBlank()); //isBlank is not defined it was added after java 8
		
		

	}

}
