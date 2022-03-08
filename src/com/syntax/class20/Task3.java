package com.syntax.class20;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour
    of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher
    and PianoTeacher that would have it their own features and behaviour.
     Test all 4 classes
     */
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Teyfur";
        mathTeacher.teachCalculus();

    }
}

class Teacher1 {
    String name;
    int age;
    double weight;

    void printName() {
        System.out.println(name);
    }
}

class MathTeacher extends Teacher1 {
    boolean canTeachTrigonometry = true;

    void teachCalculus() {
        System.out.println("Teaching Calculus");
    }
}

class ChemistryTeacher extends Teacher1 {
    boolean canTeachChemicals = true;

    void teachOrganicChemistry() {
        System.out.println("Teaching Organic Chemistry");
    }
}

class PianoTeacher extends Teacher1 {
    boolean canRideBike = true;

    void teachPiano() {
        System.out.println("Teaching Piano");
    }
}
