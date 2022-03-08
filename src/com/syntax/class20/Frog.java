package com.syntax.class20;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {

        this.name = name;
        this.color = color;
        this.age = age;
        double weight = 20;//local variable
        // weight = 10;in this case local variable is preferred always
        this.weight = 10;//best practice using this here
        //if we use this then instance variable is preferred
        //if we don't assign any value for weight then weight will get default value 0.0
    }

    public Frog(String name, String color, int age, double weight) {
        //if we don't use this then the value will be null. java get confused
        //because java always prefer local variable
        //this() should be the first line inside constructor body
        this(name, color, age);
        this.weight = weight;
    }


    void printInfo() {
        //this() is not allowed inside methods
        //his(name,color,age);
        System.out.println(name + " " + color + " " + age + " " + weight);
    }
}
