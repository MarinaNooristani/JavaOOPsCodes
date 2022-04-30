package com.syntax.class33;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println(10 / 0);
            System.out.println("2");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            // e.printStackTrace();//it will show the error, but it will still execute the following code
        }
        System.out.println("4");
    }
}
