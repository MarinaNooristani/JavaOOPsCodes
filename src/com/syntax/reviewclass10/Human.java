package com.syntax.reviewclass10;


public class Human {
    private String name;
    private String color;
    private int age;

    Human(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        System.out.println("Inside the parent class Human ");
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}

class Employee extends Human {

    String employeeId;

    Employee(String name, String color, int age, String employeeId) {
        super(name, color, age);
        this.employeeId = employeeId;
    }
}

class Teacher extends Employee {

    String favSubject;

    Teacher(String name, String color, int age, String employeeId, String favSubject) {
        super(name, color, age, employeeId);
        this.favSubject = favSubject;
    }

}

class Tester123 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Asghar", "super white",
                22, "123", "Java");
        teacher.printInfo();
    }
}
