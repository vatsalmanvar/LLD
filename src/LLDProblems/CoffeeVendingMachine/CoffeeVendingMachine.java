package LLDProblems.CoffeeVendingMachine;

import LLDProblems.CoffeeVendingMachine.decorator.Coffee;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;
import LLDProblems.CoffeeVendingMachine.state.CoffeeState;
import LLDProblems.CoffeeVendingMachine.state.IdleState;
import LLDProblems.CoffeeVendingMachine.strategy.PaymentStrategy;

import java.util.List;

public class CoffeeVendingMachine {
    private static CoffeeVendingMachine instance;
    public Coffee selectedCoffee;
    private CoffeeState currentState;
    public Inventory inventory;
    private PaymentStrategy paymentStrategy;

    private CoffeeVendingMachine(PaymentStrategy strategy){
        this.currentState = new IdleState();
        this.inventory = Inventory.getInstance();
        this.paymentStrategy = strategy;
    }

    public static CoffeeVendingMachine getInstance(PaymentStrategy strategy){
        if(instance == null) instance = new CoffeeVendingMachine(strategy);
        return instance;
    }
    public void pay(Integer amount){
        paymentStrategy.pay(amount);
    }
    public void setState(CoffeeState nextState){
        this.currentState = nextState;
    }

    public void selectCoffee(CoffeeType type){
        currentState.selectCoffee(this, type);
    }

    public void addTopping(List<ToppingType> types){
        currentState.addToppings(this, types);
    }

    public void pay(){
        currentState.pay(this);
    }

    public void dispense(){
        currentState.dispense(this);
    }
}
