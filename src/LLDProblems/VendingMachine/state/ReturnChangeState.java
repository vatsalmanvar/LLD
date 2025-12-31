package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.VendingMachine;

public class ReturnChangeState extends VendingAbstractState{

    public ReturnChangeState(VendingMachine context){
        super(context);
    }

    @Override
    public void returnChange(){
        context.moneyManager.returnChange(context.selectedproduct.price);
        System.out.println("Returning change");
        context.reset();

    }
}
