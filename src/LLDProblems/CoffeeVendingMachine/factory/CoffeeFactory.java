package LLDProblems.CoffeeVendingMachine.factory;

import LLDProblems.CoffeeVendingMachine.decorator.Coffee;
import LLDProblems.CoffeeVendingMachine.decorator.ConcreteCoffee.EspressoCoffee;
import LLDProblems.CoffeeVendingMachine.decorator.concreteDecorator.ExtraSugarDecorator;
import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;

public class CoffeeFactory {

    public static Coffee createCoffee(CoffeeType type){
        if(type == CoffeeType.ESPRESSO){
            return new EspressoCoffee();
        }
        return null;
    }

    public static Coffee addTopping(Coffee coffee, ToppingType type){
        if(type == ToppingType.EXTRA_SUGAR){
            return new ExtraSugarDecorator(coffee);
        }
        return null;
    }
}
