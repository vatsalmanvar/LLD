package LLDProblems.CoffeeVendingMachine.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(float amount){
        System.out.println("paid "+ amount+" via UPI");
    }
}
