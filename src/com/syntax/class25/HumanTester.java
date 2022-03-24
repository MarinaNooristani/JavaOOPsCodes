package com.syntax.class25;

public class HumanTester {
    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //Maha.printLegs(); can call static method
        Human.printLegs();
        LivingBeing.printLegs();
    }
}
