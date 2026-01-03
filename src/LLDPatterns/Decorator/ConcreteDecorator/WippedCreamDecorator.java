package LLDPatterns.Decorator.ConcreteDecorator;

import LLDPatterns.Decorator.Coffee;
import LLDPatterns.Decorator.Decorator;

public class WippedCreamDecorator extends Decorator {

    public WippedCreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " + WippedCream";
    }

    @Override
    public int getCost(){
        return this.coffee.getCost() + 13;
    }

}
