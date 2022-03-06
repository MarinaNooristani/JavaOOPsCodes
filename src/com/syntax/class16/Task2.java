package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters,
        // numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String str = "abc123%$#@MNO987=_";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());//method chaining
        // ^ different from ! we use ^ in string

    }
}
