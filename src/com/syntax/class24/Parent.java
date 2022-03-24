package com.syntax.class24;

public class Parent {//if a class is final no one will be able to extend that class
    final String name = "Vladlen";

    final void method() {
        //name="Marina"; Cannot assign a value to final variable 'name'
        System.out.println("I am a parent");
    }
}

class Child extends Parent {
   /* void method(){
        System.out.println("I am a parent");
    }
    can't override this because it is a final method
    */
}
