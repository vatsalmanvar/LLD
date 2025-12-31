package LLDProblems.VendingMachine;

import LLDProblems.VendingMachine.entities.Inventory;
import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;
import LLDProblems.VendingMachine.state.IdleState;
import LLDProblems.VendingMachine.state.VendingMachineState;

public class VendingMachine {

    //here we are merging a state context class of state design pattern into this class

    private VendingMachineState currentState;
    private Inventory inventory;
    public static MoneyManager moneyManager;
    public static Product selectedproduct;

    public VendingMachine(Inventory inventory, MoneyManager moneyManager){
        currentState = new IdleState(this);
        this.inventory = inventory;
        this.moneyManager = moneyManager;
    }

    public void selectProduct(Product product){
        selectedproduct = product;
        currentState.selectProduct(product);
    }
    public void makePayment(Money money){
        currentState.makePayment(money);
    }
    public void dispenseProduct(){
        currentState.dispenseProduct();
    }
    public void returnChange(){
        currentState.returnChange();
    }
    public void cancelTransaction(){
        currentState.cancelTransaction();
    }

    public void setState(VendingMachineState newState){
        this.currentState = newState;
    }

    public void reset(){
        System.out.println("State is reset");
    }


}
