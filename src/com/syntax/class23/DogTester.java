package com.syntax.class23;

public class DogTester {

    //if else conditions
//loops
//methods
// constructor and this keyword
//Access modifier
//types of variables
    public static void main(String[] args) {
        Dog dog = new Dog();//print no argument constructor
        System.out.println(dog);//to print it in console using toString method

        Dog dog2 = new Dog("Tommy", "Green", "RedBull", 12, 25.5);
        dog2.changeInfo("Rocky", "Black");//change the values that we assigned in previous line
        System.out.println(dog2);////to print it in console using toString method
    }
}
