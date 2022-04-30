package com.syntax.class33;

public class Account {

    double balance;

    public void setBalance(double balance){
        if(balance<=0){
            throw new InsufficientBalance("can't set negative balance");//which says to throw an exception or have a try catch block in ThrowDemo

        }else {
            this.balance=balance;
        }
    }
}
