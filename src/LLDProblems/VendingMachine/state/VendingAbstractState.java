package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.VendingMachine;
import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;

public class VendingAbstractState implements VendingMachineState{
//optional but clean

    VendingMachine context;

    public VendingAbstractState(VendingMachine context){
        this.context = context;
    }

    public void inValidOperation(){
        System.out.println("operation is not valid in this state");
    }
    public void selectProduct(Product product){
        inValidOperation();
    }
    public void makePayment(Money money){
        inValidOperation();
    }
    public void dispenseProduct(){
        inValidOperation();
    }
    public void returnChange(){
        inValidOperation();
    }
    public void cancelTransaction(){
        inValidOperation();
    }
}
