package com.syntax.class33;

public class InsufficientBalance extends RuntimeException {//if we want to have our own class of exceptions we can extend
    //it from RuntimeException or Exception(mandatory to throw exception in method signature) class
    InsufficientBalance(String msg) {//declare constructor
        super(msg);
    }
}
