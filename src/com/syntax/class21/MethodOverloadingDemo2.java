package com.syntax.class21;

public class MethodOverloadingDemo2 {
    void printInfo(String name,int age,double weight){
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(int age,String name,double weight){
        System.out.println(name+" "+age+" "+weight);
    }void printInfo(int age,double weight,String name){
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(double weight,int age,String name){
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 obj=new MethodOverloadingDemo2();
        obj.printInfo("Marina",21,56);
    }
}
