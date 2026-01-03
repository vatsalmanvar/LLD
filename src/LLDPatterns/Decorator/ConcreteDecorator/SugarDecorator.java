package LLDPatterns.Decorator.ConcreteDecorator;

import LLDPatterns.Decorator.Coffee;
import LLDPatterns.Decorator.Decorator;

public class SugarDecorator extends Decorator {

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " + Sugar";
    }

    @Override
    public int getCost(){
        return this.coffee.getCost() + 2;
    }

}
