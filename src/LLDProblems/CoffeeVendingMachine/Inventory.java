package LLDProblems.CoffeeVendingMachine;

import LLDProblems.CoffeeVendingMachine.entities.IngredientType;

import java.util.EnumMap;
import java.util.Map;

public class Inventory {
    private static Inventory instance;
    private static Map<IngredientType, Integer> inventory = new EnumMap<>(IngredientType.class);

    private Inventory(){
    }

    public static Inventory getInstance(){
        if(instance == null) instance = new Inventory();
        return instance;
    }

    public void addIngredient(IngredientType type, Integer quantity){
        inventory.put(type, inventory.getOrDefault(type, 0)+quantity);
    }

    public synchronized void deduct(Map<IngredientType, Integer> recipe){
        System.out.println("deducted from inventory");
    }


}
