package LLDProblems.VendingMachine;

import LLDProblems.VendingMachine.entities.Inventory;
import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;

public class VendingMachineApplication {

    public static void main(String args[]){
        Inventory inventory = new Inventory();
        Product product1 = new Product("Juice", 80, 45);
        Product product2 = new Product("Chocolate", 35, 80);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        MoneyManager moneyManager = new MoneyManager();

        VendingMachine vendingMachine = new VendingMachine(inventory, moneyManager);

        vendingMachine.selectProduct(product1);
        vendingMachine.makePayment(new Money(100, 3));
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();

    }
}
