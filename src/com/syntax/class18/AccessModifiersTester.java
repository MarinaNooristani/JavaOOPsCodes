package com.syntax.class18;

public class AccessModifiersTester {
    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();
        //  System.out.println(am.name);cannot access private in another class
        System.out.println(am.age);
        System.out.println(am.color);
        System.out.println(am.weight);

    }
}
