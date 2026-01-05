package LLDProblems.ATM.state;

import LLDProblems.ATM.entities.Card;
import LLDProblems.ATM.enums.TransactionType;
import LLDProblems.ATM.factory.StateFactory;

public class WithdrawMoneyState implements AtmState{
    @Override
    public void insertCard(AtmContext context, Card card, String pin){

    }
    @Override
    public void selectTransaction(AtmContext context, TransactionType transactionType){

    }
    @Override
    public void checkBalance(AtmContext context){

    }
    @Override
    public void withdrawMoney(AtmContext context, int amount){
        context.inventory.dispenseMoney(amount);
        System.out.println("Dispensing Money");
        context.setState(StateFactory.getInstance().createReturnCarsState());
    }
    @Override
    public void depositMoney(AtmContext context, int amount){

    }
    @Override
    public void returnCard(AtmContext context){

    }
}
