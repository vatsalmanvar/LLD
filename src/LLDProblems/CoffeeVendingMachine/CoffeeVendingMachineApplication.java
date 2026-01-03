package LLDProblems.CoffeeVendingMachine;

import LLDProblems.CoffeeVendingMachine.entities.CoffeeType;
import LLDProblems.CoffeeVendingMachine.entities.ToppingType;
import LLDProblems.CoffeeVendingMachine.strategy.CardPaymentStrategy;
import LLDProblems.CoffeeVendingMachine.strategy.PaymentStrategy;

import java.util.List;

public class CoffeeVendingMachineApplication {

    public static void main(String args[]){
        PaymentStrategy paymentStrategy = new CardPaymentStrategy();
        CoffeeVendingMachine coffeeVendingMachine = CoffeeVendingMachine.getInstance(paymentStrategy);
        coffeeVendingMachine.selectCoffee(CoffeeType.ESPRESSO);
        coffeeVendingMachine.addTopping(List.of(ToppingType.EXTRA_SUGAR));
        coffeeVendingMachine.pay();
        coffeeVendingMachine.dispense();
    }


}

/*

Problem Statement
Design and implement a Coffee Vending Machine system that can serve different types of coffee,
manage ingredient inventory, process payments, and handle user interactions such as selecting coffee and
refilling ingredients.

Requirements
Multiple Coffee Types: The machine should support multiple coffee recipes (e.g., Espresso, Latte, Cappuccino).
Ingredient Management: The machine should track and manage ingredient levels, and prevent dispensing if ingredients are insufficient.
Payment Processing: The machine should process payments before dispensing coffee.
Refill Ingredients: The machine should allow refilling of ingredients.
Extensibility: Easy to add new coffee types or payment methods.


strategy for payment
decorator for coffee making
state as a vending machine states

Entities:

Coffee
BaseCoffee
Decorator
concrete Decorator

Payment
Concrete payment

state
concrete state

Context class

Inventory (Singleton)
Ingredient
Concrete Ingredient

Recipe

Main class with all the functionality
Application class






 */
