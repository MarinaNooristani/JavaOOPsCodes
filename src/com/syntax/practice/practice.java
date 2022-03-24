package com.syntax.practice;

import java.util.Scanner;

public class practice {


    }

class Parent{
    int number;
    Parent(){
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number){
        this.number=number;
        System.out.println(this.number);
    }
}
class Child extends Parent{

}
