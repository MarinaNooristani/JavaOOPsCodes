package com.syntax.class22;
public class HW3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.

     */
    static void subtraction(int x, int y) {
        System.out.println(x - y);
    }
    static void subtraction(double x, double y) {
        System.out.println(x - y);
    }
    static void subtraction(double x, double y, double z) {
        System.out.println(x - y - z);
    }
    public static void main(String[] args) {
        subtraction(67, 45);
        subtraction(23.5, 12.7);
        subtraction(9.3, 4.5, 1.2);
    }
}


