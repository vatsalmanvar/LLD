package LLDProblems.CoffeeVendingMachine.decorator;

public abstract class Decorator implements Coffee{
    protected Coffee coffee;

    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription();
    }

    @Override
    public Integer getCost(){
        return coffee.getCost();
    }
}
