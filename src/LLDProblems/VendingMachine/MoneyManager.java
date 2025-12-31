package LLDProblems.VendingMachine;

import LLDProblems.VendingMachine.entities.Money;

public class MoneyManager {
    public Money money = new Money(0, 0);

    public void addMoney(Money add){
        money.notesTotalValue += add.notesTotalValue;
        money.coinsTotalValue += add.coinsTotalValue;
        System.out.println("Money added");
    }

    public boolean canReturn(){
        return true;
    }

    public Money returnChange(int amount){
        //subtract amount from the money
        return new Money(100, 5);
    }
}
