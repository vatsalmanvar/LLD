package LLDProblems.CoffeeVendingMachine.state;

import LLDProblems.CoffeeVendingMachine.CoffeeVendingMachine;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;
import LLDProblems.CoffeeVendingMachine.factory.CoffeeFactory;

import java.util.List;

public class IdleState implements CoffeeState{

    public void selectCoffee(CoffeeVendingMachine machine, CoffeeType type){
        machine.selectedCoffee = CoffeeFactory.createCoffee(type);
        machine.setState(new AddToppingsState());
    }
    public void addToppings(CoffeeVendingMachine machine, List<ToppingType> toppings){

    }
    public void pay(CoffeeVendingMachine machine){

    }
    public void dispense(CoffeeVendingMachine machine){

    }
    public void refillIngredients(CoffeeVendingMachine machine){

    }
}
