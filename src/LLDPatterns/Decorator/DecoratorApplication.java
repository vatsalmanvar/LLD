package LLDPatterns.Decorator;

import LLDPatterns.Decorator.ConcreteDecorator.MilkDecorator;
import LLDPatterns.Decorator.ConcreteDecorator.SugarDecorator;
import LLDPatterns.Decorator.ConcreteDecorator.WippedCreamDecorator;

public class DecoratorApplication {

    public static void main(String args[]){
        Coffee coffee = new BaseCoffee();

        coffee = new WippedCreamDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
