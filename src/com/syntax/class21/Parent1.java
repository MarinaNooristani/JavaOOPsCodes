package com.syntax.class21;

public class Parent1 {
    String name = "Parent";

    void printName() {
        System.out.println(name);
    }
}

class Child1 extends Parent1 {
    String name = "Child";

    void printName() {
        String name = "Teyfur";// first priority is given to local variables
        System.out.println(name);//it prints local variable's value
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class ParentTester {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.printName();

        //1)check if there's any local name variable
        //2)then check instance variable inside child class-->this
        //3)then it will check instance variable inside parent class-->super
    }
}
