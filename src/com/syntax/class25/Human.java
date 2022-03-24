package com.syntax.class25;

public interface Human {
    //public static final redundant because by default all the variables are
    //public static final
    //public static final int legs=2;
    int legs = 2;

    //public abstract void walk();
    void walk();

    static void printLegs() {//can not override static methods but we can redeclare
        System.out.println(legs);
    }

    public default void noNeedToWorry() {
        System.out.println("default methods are there to functional programming");
    }
}

interface LivingBeing {
    static void printLegs() {//redeclare
        System.out.println("Not sure");
    }
}

class Maha implements Human, LivingBeing {//multiple inheritance

    public void walk() {
        System.out.println("I can walk");
    }
}
