package LLDPatterns.Decorator;

public class BaseCoffee implements Coffee{

    @Override
    public String getDescription(){
        return "Plain Coffee";
    }

    @Override
    public int getCost(){
        return 30;
    }

}
