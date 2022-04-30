package com.syntax.class33;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("0");
        // System.out.println(10/0);
        try {
            System.out.println(10 / 0);
            System.out.println("1");
            //throw new RuntimeException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("2");
            try {//nested try catch
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {

            }

        } catch (Exception exception) {
            System.out.println("Something went wrong");

        } finally {
            System.out.println("6");//it will be executed no matter what happens even we have an error
        }
        System.out.println("7");
    }
}
