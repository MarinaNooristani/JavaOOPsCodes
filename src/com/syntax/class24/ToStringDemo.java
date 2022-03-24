package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;

    ToStringDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("Mr.A", 21);
        System.out.println(toStringDemo.toString());
        // System.out.println(toStringDemo);
        //it will print the package class name from tostring builtin method if we don't have a user defined tostring method here
    }
}
