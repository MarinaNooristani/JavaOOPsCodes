package com.syntax.class19;

public class Car {
    String name = "Toyota";
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type) {
          /*
       if we have same local and instance variables java
       always prefer local variables if you want to instruct
       java to use instance variables we use the "this" keyword
        */
        this.name = name;
        //this.name instance variable
        // name local variable
        this.make = make;
        this.color = color;
        this.type = type;
    }

    Car() {

    }

    void printCar() {
        String name = "Tesla";//local variable in this method
        System.out.println(name);//print local variable's value in this method
        System.out.println(this.name);//print instance variable's value
    }
}
