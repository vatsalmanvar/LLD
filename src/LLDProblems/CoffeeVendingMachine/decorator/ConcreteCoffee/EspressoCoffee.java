package LLDProblems.CoffeeVendingMachine.decorator.ConcreteCoffee;

import LLDProblems.CoffeeVendingMachine.Inventory;
import LLDProblems.CoffeeVendingMachine.decorator.Coffee;
import LLDProblems.CoffeeVendingMachine.entities.IngredientType;

import java.util.HashMap;
import java.util.Map;

public class EspressoCoffee implements Coffee {

    private Map<IngredientType, Integer> recipe = new HashMap<>();

    public EspressoCoffee(){
        this.recipe.put(IngredientType.WATER, 4);
        this.recipe.put(IngredientType.SUGAR, 3);
    }

    @Override
    public String getDescription(){
        return "Espresso";
    }
    @Override
    public Integer getCost(){
        return 50;
    }

    public Map<IngredientType, Integer> getRecipe(){
        return recipe;
    }

}
