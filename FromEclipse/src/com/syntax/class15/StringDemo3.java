package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		String name = "How are @you @are guys@ ";
		System.out.println(name.indexOf("@"));// 8
		System.out.println(name.lastIndexOf("@"));// last one//22
		System.out.println(name.indexOf("@"));// first one//8
		System.out.println(name.indexOf("@", 8 + 1));// 13
		System.out.println(name.indexOf("@", name.indexOf("@") + 1));
		System.out.println(name.indexOf("@", 14));
		System.out.println(name.indexOf("are", 5));

	}

}
