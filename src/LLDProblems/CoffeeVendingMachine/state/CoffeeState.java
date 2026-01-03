package LLDProblems.CoffeeVendingMachine.state;

import LLDProblems.CoffeeVendingMachine.CoffeeVendingMachine;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;

import java.util.List;

public interface CoffeeState {
    void selectCoffee(CoffeeVendingMachine machine, CoffeeType type);
    void addToppings(CoffeeVendingMachine machine, List<ToppingType> toppings);
    void pay(CoffeeVendingMachine machine);
    void dispense(CoffeeVendingMachine machine);
    void refillIngredients(CoffeeVendingMachine machine);
}
