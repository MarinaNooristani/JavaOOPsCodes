package com.syntax.class22;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value variable
      should be printed. Example, if we pass "Java", then "I love Java" should be printed.
     */
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String s) {
        System.out.println("I love " + s);
    }

    public static void main(String[] args) {
        Programming programming = new Programming();
        new Programming("Java");

    }

    //interview Question main method overloading
    public static void main(String args) {
        Programming programming = new Programming();
        new Programming("Java");
        //do not call this method in main method it will be an infinite loop
    }
}

