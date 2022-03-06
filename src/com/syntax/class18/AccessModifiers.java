package com.syntax.class18;

public class AccessModifiers {
    private String name = "Tarik";//can access in the same class only
    int age; //default access but not a keyword
    protected double weight = 50;
    public String color = "White";//accessible anywhere

    public static void main(String[] args) {
        //i can access any of these variables inside this class
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.color);
        System.out.println(am.weight);

    }
}
