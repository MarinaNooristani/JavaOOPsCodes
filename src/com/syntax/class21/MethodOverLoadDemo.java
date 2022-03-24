package com.syntax.class21;

public class MethodOverLoadDemo {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void add(String num1, String num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        //if both methods are static and inside the same class we call the method only by its name
        add(10,10);//if we have same method name depends on what we pass java tries to find the best match
        add(10.0,2.3);
        add("20","22");
    }
}
//println is an overloaded method