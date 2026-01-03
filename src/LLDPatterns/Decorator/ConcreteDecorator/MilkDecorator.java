package LLDPatterns.Decorator.ConcreteDecorator;

import LLDPatterns.Decorator.Coffee;
import LLDPatterns.Decorator.Decorator;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " + Milk";
    }

    @Override
    public int getCost(){
        return this.coffee.getCost() + 18;
    }

}
