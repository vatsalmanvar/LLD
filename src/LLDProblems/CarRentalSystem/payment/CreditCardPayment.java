package LLDProblems.CarRentalSystem.payment;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+" via credit card");
    }
}
