package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        /*
        accessing a field directly is different
        from accessing the same field with methods
        having different access modifier
         */
        Account account1 = new Account();
        //  account1.printUserName(); private
        account1.printPassword(); //protected
        account1.printBalance();//default
        account1.printAccountNumber();//public
        //if we call variables directly
        // System.out.println(account1.userName);//private
        // System.out.println(account1.password);//private
        //  System.out.println(account1.balance);//private
        System.out.println(account1.accountNumber);//public
    }
}
