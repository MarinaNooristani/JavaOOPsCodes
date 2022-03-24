package com.syntax.class23;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
   Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
   Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interest;

    //best practice to initialize fields
    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest() {
        System.out.println(balance * interest);
    }
}

class AX extends CreditCard {
    //matching constructor click on red line
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance * interest) + 2);// put multiplication operation inside parenthesis
    }
}

class Visa extends CreditCard {
    //matching constructor
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance * interest) + 1);
    }

}

class CreditCardTeste {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100, .15);
        creditCard.calculateInterest();
        AX ax = new AX(100, .15);
        ax.calculateInterest();
        Visa visa = new Visa(100, .15);
        visa.calculateInterest();
    }
}