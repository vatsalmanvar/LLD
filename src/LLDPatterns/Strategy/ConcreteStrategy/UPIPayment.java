package LLDPatterns.Strategy.ConcreteStrategy;

import LLDPatterns.Strategy.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {

    private String upiId;

    public UPIPayment(String upiId){
        this.upiId=upiId;
    }

    public void pay(double amount){
        System.out.println("Paid via UPI");
    }
}
