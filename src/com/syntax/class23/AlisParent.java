package com.syntax.class23;

public class AlisParent {
    String girlName = "Selma";
    double money = 100000;

    void marry() {
        System.out.println("Ali You should marry " + girlName);
    }
}

class Ali extends AlisParent {
    String girlName = "Rihanna";//if we delete this field it will print selma for line 17

    void marry() {//if we delete this method it will print the method from parent class
        super.marry();
        System.out.println("Dad But I want to marry " + girlName);
    }
}
