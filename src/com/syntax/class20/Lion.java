package com.syntax.class20;

public class Lion extends Animal {
    //build on existing knowledge
    //if base class has an error then all the derived classes will have issues
    //one minor change in base class can cause issues in other derived classes
    boolean huntOthers = true;

    void roar() {
        System.out.println(name + " is roaring color=" +
                color + " huntOthers " + huntOthers);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Alex";
        lion.color = "brown";
        lion.sleep();
        lion.roar();
    }
}
