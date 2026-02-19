package LLDProblems.CarRentalSystem;

import LLDProblems.CarRentalSystem.emuns.CarType;
import LLDProblems.TaskManagementSystem.entities.User;

import java.util.Date;

public class CarRentalSystemDemo {

    public static void main(String args[]){
        CarRentalSystem instance = CarRentalSystem.getInstance();

        Customer customer = new Customer("Vatsal", "378ryfuiy83");
        Car car1 = new Car("MH12HJ3574", CarType.SEDAN);

        instance.addCar(car1);

        Reservation reservation = instance.makeReservation(customer, car1, new Date(), new Date());

        instance.pay(reservation);

    }
}
