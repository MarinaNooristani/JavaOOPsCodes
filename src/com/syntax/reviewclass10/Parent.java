package com.syntax.reviewclass10;

class GrandParent {
    String name;

    GrandParent(String name) {
        // System.out.println("Grand Parent");//java will start creating objects from the top so Grand Parent Parent Child will be printed
        this.name = name;
    }

    void printName() {
        System.out.println(name);
    }
}

public class Parent extends GrandParent {
    Parent(String name) {
        //for matching constructor we have to pass the parameter for the constructor that we're calling
        // through super keyword ( super("Marina");) if it has parameter(to fulfill the pre condition)
        //super("Marina"); instead super(name) and then have the same parameter as the parent constructor
        super(name);
        printName();
        // System.out.println("Parent");
    }

}

class Child extends Parent {
    Child(String name) {
        super(name);
        // System.out.println("Child");
    }
}

class Tester {
    public static void main(String[] args) {
        Child child = new Child("Edward");
        //if something does not participate like private constructor... in inheritance then we can not call it using this child object
        child.printName();
    }

}
