package com.syntax.class24;

public interface Employee {//interfaces are abstract by default, so we don't need to write the abstract keyword
   // int age; can not have an instance variable
   public static final int age=12;
   //by default all the variables in interfaces are public static final
    void work();//we don't need to write the abstract and public keyword here
    //all the methods inside an interface which do not have body are abstract and public by default
    //cannot use static and final keyword with an abstract method since we cannot override the implementation
    //private access modifiers do not participate in inheritance, and we can not override private methods
}

class Tester implements Employee {

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.work();
        System.out.println(Employee.age);
        Employee tester2=new Tester();//we can use polymorphism in interface as well
    }
}
