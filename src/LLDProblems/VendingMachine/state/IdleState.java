package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.VendingMachine;
import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;

public class IdleState extends VendingAbstractState{

    public IdleState(VendingMachine context){
        super(context);
    }

    @Override
    public void selectProduct(Product product){
        System.out.println("selecting a product");
        context.setState(new ReadyState(context));
    }
}
