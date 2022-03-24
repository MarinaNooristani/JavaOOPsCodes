package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        Suzuki suzuki = new Suzuki();
        suzuki.park();
        suzuki.start();
        System.out.println("__________________________");
        //  BMW bmw1=new Car();narrowing
        Car car = new BMW();//widening
        car = new Tesla();
        car = new Suzuki();
        car.start();
        //polymorphism with the help of overriding
        Object str = new String("abcd");//widening
        //Object is the parent/godfather of all the classes in java
    }
}
