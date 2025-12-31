package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.VendingMachine;
import LLDProblems.VendingMachine.entities.Money;

public class ReadyState extends VendingAbstractState{

    public ReadyState(VendingMachine context){
        super(context);
    }

    @Override
    public void makePayment(Money money){
        System.out.println("money is added");
        context.moneyManager.addMoney(money);
        context.setState(new DispenseState(context));
    }
}
