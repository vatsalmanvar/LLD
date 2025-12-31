package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.VendingMachine;
import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;

public class DispenseState extends VendingAbstractState{

    public DispenseState(VendingMachine context){
        super(context);
    }

    @Override
    public void dispenseProduct(){
        System.out.println("product is getting dispensed");
        context.setState(new ReturnChangeState(context));
    }
}
