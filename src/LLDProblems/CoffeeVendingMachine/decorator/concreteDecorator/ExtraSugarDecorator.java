package LLDProblems.CoffeeVendingMachine.decorator.concreteDecorator;

import LLDProblems.CoffeeVendingMachine.decorator.Coffee;
import LLDProblems.CoffeeVendingMachine.decorator.Decorator;

public class ExtraSugarDecorator extends Decorator {

    public ExtraSugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " Extra sugar";
    }

    @Override
    public Integer getCost(){
        System.out.println("10 ruppes for extra sugar");
        return coffee.getCost() + 10;
    }

}
