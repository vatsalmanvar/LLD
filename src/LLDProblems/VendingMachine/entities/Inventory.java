package LLDProblems.VendingMachine.entities;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private String inventoryId;
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product){
        products.put(product.productId, product);
    }

    public void removeProduct(){}
}
