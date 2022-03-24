package com.syntax.reviewclass9;

public class Doctor {
    //instance variables-declared inside the class but outside any method, constructor or block of code
    public String firstName;
    protected String lastName;
    String speciality;
    private double salary;

    //static variables-declared inside the class but outside any method, constructor or block of code
    //using static keyword
    static String hospital = "George washington";

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //we can have multiple constructor by overloading them

    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }

    public void printInfo() {
        this.hello();//we do not need to put this (compiler adds it by default)
        System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality + " at " + hospital);
    }

    //static methods can only access static members
    protected static void work() {
        System.out.println("All doctors work at " + hospital);
    }

    void hello() {
        System.out.println("Hello");
    }

    private void getPaid() {
        System.out.println("Doctor " + firstName + " " + lastName + " get paid " + salary);
    }

    /*static methods can not access non-static members
    static void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }
     */
    //non-static methods can access non-static members and static members


    //non-static methods can access static members
    void work1() {
        System.out.println("All doctors work at " + hospital);
    }
}
