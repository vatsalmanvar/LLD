package LLDProblems.CoffeeVendingMachine.state;

import LLDProblems.CoffeeVendingMachine.CoffeeVendingMachine;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;

import java.util.List;

public class dispenceState implements CoffeeState{
    public void selectCoffee(CoffeeVendingMachine machine, CoffeeType type){

    }
    public void addToppings(CoffeeVendingMachine machine, List<ToppingType> toppings){

    }
    public void pay(CoffeeVendingMachine machine){

    }
    public void dispense(CoffeeVendingMachine machine){
        System.out.println("Deducting ingredients");
        System.out.println(machine.selectedCoffee.getDescription());
        System.out.println("Dispensing coffee");
        machine.setState(new IdleState());
    }
    public void refillIngredients(CoffeeVendingMachine machine){

    }
}
