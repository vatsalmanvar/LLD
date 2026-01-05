package LLDProblems.ATM.factory;

import LLDProblems.ATM.state.*;

public class StateFactory {
    private static StateFactory instance;

    private StateFactory(){}

    public static StateFactory getInstance(){
        if(instance == null) instance = new StateFactory();
        return instance;
    }

    public AtmState createIdleState(){
        return new IdleState();
    }

    public AtmState createSelectTransactionState(){
        return new SelectTransaction();
    }

    public AtmState createReturnCarsState(){
        return new ReturnCardState();
    }

    public AtmState createBalanceEnquiryState(){
        return new BalanceEnquireState();
    }

    public AtmState createWithdrawMoneyState(){
        return new WithdrawMoneyState();
    }
}
