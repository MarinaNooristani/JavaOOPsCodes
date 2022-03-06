package com.syntax.class18;

public class Account {
    private String userName = "Teyfur";
    private String password = "Admin";
    public String accountNumber = "123445";
    private double balance = -150000;

    private void printUserName() {
        System.out.println(userName);
    }

    protected void printPassword() {
        System.out.println(password);
    }

    void printBalance() {
        System.out.println(balance);
    }

    //even if the variable has private access i still can call this method in other class or package
    // since the method has a public access
    public void printAccountNumber() {
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.printUserName();
        account1.printPassword();
        account1.printBalance();
        account1.printAccountNumber();

        //if we call variables directly
        System.out.println(account1.userName);
        System.out.println(account1.password);
        System.out.println(account1.balance);
        System.out.println(account1.accountNumber);
    }

}
