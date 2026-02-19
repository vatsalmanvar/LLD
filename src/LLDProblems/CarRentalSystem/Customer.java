package LLDProblems.CarRentalSystem;

import java.util.UUID;

public class Customer {
    String id;
    String name;
    String licence;

    public Customer(String name, String licence){
        this.name=name;
        this.licence=licence;
        this.id= UUID.randomUUID().toString();
    }



}
