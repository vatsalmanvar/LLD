package OOPs;

public class Encapsulation {
    //Means wrapping the data and methods together and restricting the direct access to data

    //HOW-> keeping variable private and methods as public

    private double balance; // keeping this private means, you can not access directly from outside

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){ // making this public will return the value to the outer world.
        return balance;
    }

    // so the deep meaning is outer world can only deposit and get the balance, they can not directly interact with
    // balance property

    //helper method to run the encapsulation
    public void execute(){
        System.out.println("Balance is: " + getBalance());
        System.out.println("Deposit -> 1000");
        deposit(1000);
        System.out.println("Balance is: " + getBalance());
    }
}
