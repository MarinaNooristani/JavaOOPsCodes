package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
        child.print();
    }
}

class GrandParents {
    String color = "Blue";
    void printInfo(){
        System.out.println("I am grand parent");
    }
}

class Parent {
    String color = "Black";//parent is close to child so black is preferred not blue
    void printInfo(){
        System.out.println("I am parent");
    }
}

class Child extends Parent {
    String color = "Red";
    void printInfo(){
        System.out.println("I am child");
    }
    void print(){
        printInfo();
        super.printInfo();
    }

    void printColor() {
        String color = "green";
        System.out.println(color);//print local variable's value
        System.out.println(this.color);//print from child class
        System.out.println(super.color);//to print from parent class using super keyword
    }
}

