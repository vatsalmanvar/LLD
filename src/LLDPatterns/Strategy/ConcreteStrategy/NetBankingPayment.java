package LLDPatterns.Strategy.ConcreteStrategy;

import LLDPatterns.Strategy.PaymentStrategy;

public class NetBankingPayment implements PaymentStrategy {
    private String bankName;

    public NetBankingPayment(String bankName){
        this.bankName=bankName;
    }

    public void pay(double amount){
        System.out.println("Paid via net banking");
    }
}
