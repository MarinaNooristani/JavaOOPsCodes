package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
	    String name="   Marina  Nooristani    ";
		System.out.println(name);
		System.out.println(name.trim());
		
		System.out.println(name.startsWith("Marina"));//false because it has spaces
		
		String name2="Marina Nooristani";
		System.out.println(name2.startsWith("Marina"));//true
		System.out.println("Nooristani".startsWith(name2));//false
		
		System.out.println(name2.toLowerCase().startsWith("Marina"));//method chaining
		
		System.out.println(name2.endsWith("Marina"));//false
		System.out.println(name2.endsWith("i"));//true
		System.out.println(name2.contains("i"));//true

	}

}
