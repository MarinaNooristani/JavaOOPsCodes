package com.syntax.class20;

public class FrogTester {
    public static void main(String[] args) {
        Frog frog=new Frog("Valera","pink",12,28);
        frog.printInfo();
        new Frog("pepe","green",12).printInfo();
    }

}
