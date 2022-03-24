package com.syntax.reviewclass8;

public class Class1 {
    public void printSmallerDigit(int x, int y) {
        if (x < y) {
            System.out.println(x + " is the smaller one");
        } else if (x > y) {
            System.out.println(y + " is the smaller one");
        } else {
            System.out.println("Both the values are same");
        }
    }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        //we can use same object to pass different values each time it will ask for new values
        obj.printSmallerDigit(3, 5);
        obj.printSmallerDigit(4, 6);
    }
}
