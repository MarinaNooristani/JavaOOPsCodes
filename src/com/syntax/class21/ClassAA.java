package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;


    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }
}

class ClassBB extends ClassAA {
    public ClassBB(String name, int age, double weight) {
        super(name, age, weight);//in the industry this way is used mostly
        /*constructors from the parent classes do not participate in inheritance
      to solve this problem we need to create a matching constructor in the child class
      as well with the same type of argument
      we can use super() to call the constructor from the parent class so that we don't have to repeat the code

     */
    }
}

class Test {
    public static void main(String[] args) {
        ClassBB classBB = new ClassBB("Tristan", 21, 91);
        classBB.printInfo();
    }
}

