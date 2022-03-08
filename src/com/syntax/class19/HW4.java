package com.syntax.class19;

public class HW4 {
    /*  Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed

     */
    String bookName;
    double price;

    public HW4() {
        System.out.println("No argument constructor");
    }

    public HW4(String bookName, double price) {
        this();//we use this() to call one constructor inside another
        this.bookName = bookName;
        this.price = price;
        System.out.println("two argument constructor");
    }
}
