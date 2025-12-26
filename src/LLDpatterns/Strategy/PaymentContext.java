package LLDpatterns.Strategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void makePayment(double amount){
        if(strategy == null) throw new IllegalStateException("Strategy object is null");
        strategy.pay(amount);
    }
}
