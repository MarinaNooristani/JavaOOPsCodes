package com.syntax.class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone samsung = new Samsung();//indirectly abstract class instantiation
        Phone iphone = new Iphone();
        samsung.makePhoneCall();
        samsung.displaypicture();
        iphone.unlockPhone();
        // Phone phone=new Phone();'Phone' is abstract; cannot be instantiated


    }
}
