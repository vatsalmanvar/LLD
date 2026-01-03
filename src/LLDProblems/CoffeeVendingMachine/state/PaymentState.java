package LLDProblems.CoffeeVendingMachine.state;

import LLDProblems.CoffeeVendingMachine.CoffeeVendingMachine;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;
import LLDProblems.CoffeeVendingMachine.factory.CoffeeFactory;

import java.util.List;

public class PaymentState implements CoffeeState{
    public void selectCoffee(CoffeeVendingMachine machine, CoffeeType type){

    }
    public void addToppings(CoffeeVendingMachine machine, List<ToppingType> toppings){

    }
    public void pay(CoffeeVendingMachine machine){
        machine.pay(machine.selectedCoffee.getCost());
        machine.setState(new dispenceState());
    }
    public void dispense(CoffeeVendingMachine machine){

    }
    public void refillIngredients(CoffeeVendingMachine machine){

    }
}
