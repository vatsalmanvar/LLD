package LLDProblems.VendingMachine.entities;

public class Money {
    public int notesTotalValue;
    public int coinsTotalValue;

    public Money(int notesTotalValue, int coinsTotalValue){
        this.notesTotalValue = notesTotalValue;
        this.coinsTotalValue = coinsTotalValue;
    }

    public int totalMoney(){return notesTotalValue+coinsTotalValue;}

}
