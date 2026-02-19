package LLDProblems.CarRentalSystem;

import java.util.Date;

public class Reservation {
    String id;
    Customer customer;
    Car car;
    Date startdate;
    Date endState;


    public Reservation(Customer customer, Car car, Date startdate, Date endState){
        this.car=car;
        this.customer=customer;
        this.startdate=startdate;
        this.endState=endState;
    }

    public int getTotalPrice(){
        // calculate from start date to end date;
        return 100;
    }

}
