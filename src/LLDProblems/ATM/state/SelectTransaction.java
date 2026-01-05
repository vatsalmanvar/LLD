package LLDProblems.ATM.state;

import LLDProblems.ATM.entities.Card;
import LLDProblems.ATM.enums.TransactionType;
import LLDProblems.ATM.factory.StateFactory;

public class SelectTransaction implements AtmState{
    @Override
    public void insertCard(AtmContext context, Card card, String pin){

    }
    @Override
    public void selectTransaction(AtmContext context, TransactionType transactionType){
        if(transactionType==TransactionType.BALANCE_INQUIRY){
            context.setState(StateFactory.getInstance().createBalanceEnquiryState());
        }
        if(transactionType==TransactionType.WITHDRAW){
            context.setState(StateFactory.getInstance().createWithdrawMoneyState());
        }
    }
    @Override
    public void checkBalance(AtmContext context){

    }
    @Override
    public void withdrawMoney(AtmContext context, int amount){

    }
    @Override
    public void depositMoney(AtmContext context, int amount){

    }
    @Override
    public void returnCard(AtmContext context){

    }
}
