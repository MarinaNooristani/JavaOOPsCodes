package com.syntax.class33;

import com.syntax.class23.Dog;

public class NullPonterDemo {
    public static void main(String[] args) {
        //popular Interview question
        //we get the null pointer exception when an object is not initialized properly
        // and if we try to call any method on that object

        String str = null;
        //we get the null pointer exception when a method is called on an object which is not
        //initialized
        // str.length();
        Dog dog = null;
        //  dog.toString();
        int[] arr = new int[-5];

    }
}
