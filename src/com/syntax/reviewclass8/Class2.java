package com.syntax.reviewclass8;

public class Class2 {
    String generateUsername(String firstName, String lastName) {
        return firstName + "123" + lastName + ".com";
    }

    static void moreedDemand() {
        System.out.println("This is moreeed functions");
    }

    public static void main(String[] args) {
        moreedDemand();//we call static method inside another static method directly
        Class2 obj = new Class2();
        System.out.println(obj.generateUsername("Emilia", "Gulnar"));
    }
}