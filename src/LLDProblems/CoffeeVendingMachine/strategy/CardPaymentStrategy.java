package LLDProblems.CoffeeVendingMachine.strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(float amount){
        System.out.println("paid "+ amount+" via card");
    }
}
