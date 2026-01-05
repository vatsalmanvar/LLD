package LLDProblems.ATM.entities;

import LLDProblems.ATM.enums.Denomination;

import java.util.HashMap;
import java.util.Map;

public class CashInventory {

    Map<Denomination, Integer> cash = new HashMap<>();

    public CashInventory(){
        cash.put(Denomination.BILL_10, 100);
        cash.put(Denomination.BILL_50, 200);
    }

    public synchronized void dispenseMoney(int amount){
        System.out.println("Dispensing money worth rupees: "+amount);
    }

    //add money method
    //check balance method
}
