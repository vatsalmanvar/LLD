package LLDProblems.VendingMachine.entities;

import java.util.UUID;

public class Product {
    public String productId;
    private String name;
    private int quantity;
    public int price;

    public Product(String name, int price, int quantity){
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public boolean isAvailable(){
        return quantity>0;
    }

    public void reduceQuantityByOne(){
        //if(!this.isAvailable()) throw new OperationNotSupportedException();
        quantity-=1;
    }

    public void updateProductQuantity(Product product, int newQuantity){}

}
