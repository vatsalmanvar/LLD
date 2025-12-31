package LLDProblems.VendingMachine.state;

import LLDProblems.VendingMachine.entities.Money;
import LLDProblems.VendingMachine.entities.Product;

public interface VendingMachineState {
    void selectProduct(Product product);
    void makePayment(Money money);
    void dispenseProduct();
    void returnChange();
    void cancelTransaction();
}
