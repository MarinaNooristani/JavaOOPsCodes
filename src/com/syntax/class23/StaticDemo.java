package com.syntax.class23;

public class StaticDemo {

}

class Cat {
    static int noOfLegs = 4;//single value
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name + noOfLegs);
    }

    public static void print() {
        //we can't access the instance fields directly inside static methods
        //System.out.println(name+NoOfLegs);
        //we can't use instance fields with static methods
        // System.out.println(name);
        System.out.println(noOfLegs);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Stella");
        Cat.print();
        Cat cat2 = new Cat("Nutella");
        Cat.print();
    }
}
