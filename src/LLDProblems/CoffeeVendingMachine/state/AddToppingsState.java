package LLDProblems.CoffeeVendingMachine.state;

import LLDProblems.CoffeeVendingMachine.CoffeeVendingMachine;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;
import LLDProblems.CoffeeVendingMachine.factory.CoffeeFactory;
import LLDProblems.Tictactoe.entities.Player;

import java.util.List;

public class AddToppingsState implements CoffeeState{

    public void selectCoffee(CoffeeVendingMachine machine, CoffeeType type){

    }
    public void addToppings(CoffeeVendingMachine machine, List<ToppingType> toppings){
        for(ToppingType type: toppings){
            machine.selectedCoffee = CoffeeFactory.addTopping(machine.selectedCoffee, type);
        }
        machine.setState(new PaymentState());
    }
    public void pay(CoffeeVendingMachine machine){

    }
    public void dispense(CoffeeVendingMachine machine){

    }
    public void refillIngredients(CoffeeVendingMachine machine){

    }
}
