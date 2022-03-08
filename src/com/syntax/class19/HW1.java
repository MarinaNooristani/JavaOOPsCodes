package com.syntax.class19;

public class HW1 {
    /*Write a java class that have 4 constructors with 4 different access levels of
     constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */
    private HW1() {
        System.out.println("Private");
    }

    HW1(double a) {
        System.out.println("Default");
    }

    protected HW1(String a) {
        System.out.println("Protected");
    }

    public HW1(boolean a) {
        System.out.println("Public");
    }

    public static void main(String[] args) {
        //calling sequence matter
        new HW1();
        new HW1(2.3);
        new HW1(false);
        new HW1("Haha");
    }
}
