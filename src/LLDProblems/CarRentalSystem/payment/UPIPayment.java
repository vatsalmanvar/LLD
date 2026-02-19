package LLDProblems.CarRentalSystem.payment;

public class UPIPayment implements Payment{

    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+" via UPI");
    }
}
