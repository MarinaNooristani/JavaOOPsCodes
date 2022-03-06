package com.syntax.class18;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    //accessible by class name-->static in this condition we don't need to create object
    public static String reverseString(String str) {
        //longer way
        // StringBuilder stringBuilder = new StringBuilder(str);
        // storing object inside the variable = object creation
        //stringBuilder.reverse();
        // return stringBuilder.toString();
        return new StringBuilder(str).reverse().toString();//method chaining
        //new StringBuilder(str) --> creating object from StringBuilder class
        // and instead of storing it inside a variable we just return the value


    }

    public static void main(String[] args) {
        String name = "Marina";
        //we don't need to create object because it's accessible by class name
        System.out.println(Task2.reverseString(name));
    }

}
