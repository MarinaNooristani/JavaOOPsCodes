package com.syntax.reviewclass9;

import javax.print.Doc;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("John", "Smith", "Surgeaon");
        Doctor doc1 = new Doctor("Jane", "Smith");
        doc.printInfo();
        doc1.printInfo();
        System.out.println("changing the value of instance variables");
        doc1.speciality = "dermatologist";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("changing the value of static variable");
        //static variable should be accessed in static way->by class name where the variable is defined
        Doctor.hospital = "Inova";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("_____________________________");
        doc1.hospital = "Best hospital";
        doc.printInfo();
        doc1.printInfo();
        /**
         * must->variable-> datatype, name   access and non access modifier is optional
         * must->method->return type, name() access and non access modifier is optional
         */


    }
}
