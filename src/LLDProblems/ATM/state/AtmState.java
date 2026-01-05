package LLDProblems.ATM.state;

import LLDProblems.ATM.entities.Card;
import LLDProblems.ATM.enums.TransactionType;

public interface AtmState {
    void insertCard(AtmContext context, Card card, String pin);
    void selectTransaction(AtmContext context, TransactionType transactionType);
    void checkBalance(AtmContext context);
    void withdrawMoney(AtmContext context, int amount);
    void depositMoney(AtmContext context, int amount);
    void returnCard(AtmContext context);
}
