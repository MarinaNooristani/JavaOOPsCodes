package com.syntax.class28;

public class GenericsDemo {
    static void add(int num1, int num2) {
        //if we only have this method, and we call the method and pass double type value compile time error will be thrown.
        //so we need to overload the method
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        add(10.5, 10.2);

    }
}
