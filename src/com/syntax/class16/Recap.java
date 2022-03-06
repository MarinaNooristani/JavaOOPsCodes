package com.syntax.class16;

public class Recap {
    public static void main(String[] args) {
        String name = "This is my #0345685967 Marina";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.charAt(name.length() - 1));
        System.out.println("________________________________________");
        System.out.println(name.indexOf("A"));//-1
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println("________________________________________");
        System.out.println(name.substring(name.indexOf("#")));
        System.out.println(name.substring(name.indexOf("#") + 1));
        System.out.println(name.substring(12, 23));
        System.out.println(name.substring(name.indexOf("#") + 1, name.indexOf("#") + 1 + 11));


    }
}
