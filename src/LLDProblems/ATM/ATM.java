package LLDProblems.ATM;

import LLDProblems.ATM.entities.Card;
import LLDProblems.ATM.entities.CashInventory;
import LLDProblems.ATM.enums.TransactionType;
import LLDProblems.ATM.state.AtmContext;

public class ATM {

    public static void main(String args[]){
        CashInventory inventory = new CashInventory();
        AtmContext atm = new AtmContext(inventory);

        atm.insertCard(new Card("123456789", "123"), "1234");
        atm.selectTransaction(TransactionType.WITHDRAW);
        atm.withdrawMoney(1000);
        atm.returnCard();

        atm.insertCard(new Card("123456789", "123"), "1234");
        atm.selectTransaction(TransactionType.BALANCE_INQUIRY);
        atm.checkBalance();
        atm.returnCard();
    }

}

/*

Problem Statement
Design and implement an ATM (Automated Teller Machine) system that allows users to perform basic banking operations
such as balance inquiry, cash withdrawal, and cash deposit, with secure authentication and proper cash management.

Requirements
User Authentication: Users must authenticate using a card and PIN.
Balance Inquiry: Users can check their account balance.
Cash Withdrawal: Users can withdraw cash if sufficient balance and cash are available.
Cash Deposit: Users can deposit cash into their account.
Transaction Management: The system records and processes transactions (withdrawal, deposit).
Banking Service Integration: The ATM interacts with a backend banking service to validate accounts and perform transactions.
Cash Dispenser: The ATM manages its own cash inventory and dispenses cash securely.
Concurrency & Consistency: The system handles concurrent access and ensures data consistency.
User Interface: The ATM provides a user-friendly interface for operations.
Extensibility: Easy to add new features such as mini-statements, fund transfers, or multi-currency support.


State design pattern


Entities

Dominations - enum
transaction - enum

Cash management
Card
Account

ATM context
state - interface
Concrete state -> idle , has card, select operation, return card



 */
