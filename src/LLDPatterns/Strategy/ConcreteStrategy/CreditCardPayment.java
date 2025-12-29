package LLDPatterns.Strategy.ConcreteStrategy;

import LLDPatterns.Strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber=creditCardNumber;
    }

    public void pay(double amount){
        System.out.println("Paid via Credit Card");
    }
}
