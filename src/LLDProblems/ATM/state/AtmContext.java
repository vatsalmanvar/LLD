package LLDProblems.ATM.state;

import LLDProblems.ATM.entities.Account;
import LLDProblems.ATM.entities.Card;
import LLDProblems.ATM.entities.CashInventory;
import LLDProblems.ATM.enums.TransactionType;
import LLDProblems.ATM.factory.StateFactory;

public class AtmContext {

    private AtmState currentState;
    private Card card;
    private Account account;
    public CashInventory inventory;

    public AtmContext(CashInventory inventory){
        this.currentState = StateFactory.getInstance().createIdleState();
        this.inventory = inventory;
    }

    public void setState(AtmState newState){
        this.currentState = newState;
    }

    public void insertCard(Card card, String pin){
        this.currentState.insertCard(this,card, pin);
    }
    public void selectTransaction(TransactionType transactionType){
        this.currentState.selectTransaction(this, transactionType);
    }
    public void checkBalance(){
        this.currentState.checkBalance(this);
    }
    public void withdrawMoney(int amount){
        this.currentState.withdrawMoney(this, amount);
    }
    public void depositMoney(int amount){
        this.currentState.depositMoney(this, amount);
    }
    public void returnCard(){
        this.currentState.returnCard(this);
    }


    public void setCard(Card card){this.card = card;}
    public void setAccount(Account account){this.account = account;}
}
