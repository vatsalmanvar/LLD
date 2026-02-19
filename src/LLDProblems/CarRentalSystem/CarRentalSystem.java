package LLDProblems.CarRentalSystem;

import LLDProblems.CarRentalSystem.payment.Payment;
import LLDProblems.CarRentalSystem.payment.UPIPayment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRentalSystem {

    private static CarRentalSystem instance;
    private List<Car> cars;
    private List<Reservation> reservations;
    private Payment paymentStrategy;

    private CarRentalSystem(){
        cars=new ArrayList<>();
        reservations=new ArrayList<>();
        paymentStrategy=new UPIPayment();
    }

    public static CarRentalSystem getInstance(){
        if(instance == null){
            instance = new CarRentalSystem();
        }
        return instance;
    }

    public void addCar(Car car){cars.add(car);}

    public void pay(Reservation reservation){
        paymentStrategy.pay(reservation.getTotalPrice());
    }

    public boolean isCarAvaialble(Car car, Date startDate, Date endDate){
        //go though all the reservation and then take the decision whether car is available or not
        System.out.println("Checking car is available or not");
        return true;
    }

    public Reservation makeReservation(Customer customer, Car car, Date startDate, Date endDate){
        if(!isCarAvaialble(car, startDate, endDate)){
            System.out.println("Car is not available");
            return null;
        }

        Reservation newReservation = new Reservation(customer, car, startDate, endDate);
        reservations.add(newReservation);
        return newReservation;
    }



}

/*
Designing a Car Rental System
Requirements
The car rental system should allow customers to browse and reserve available cars for specific dates.
Each car should have details such as make, model, year, license plate number, and rental price per day.
Customers should be able to search for cars based on various criteria, such as car type, price range, and availability.
The system should handle reservations, including creating, modifying, and canceling reservations.
The system should keep track of the availability of cars and update their status accordingly.
The system should handle customer information, including name, contact details, and driver's license information.
The system should handle payment processing for reservations.
The system should be able to handle concurrent reservations and ensure data consistency.


Entities

Vehicle - type of vehicle - factory design pattern
Booking -  will align vehicle with user
User   - with all the user detail
Payment Interface - strategy of payment
Rent deciding - strategy of price calculation

for concurrent request handling we can lock the vehicle object so It will be used by only one thread at a moment


Entities

Vehicle - interface
Car class of vehicle
...

Booking - Vehicle and rate strategy

Payment interface
Concrete payment classes

CarBookingSystem - singleton design pattern with only one instance
    - will have list of vehicles, list of bookings -



FROM chatGPT

ask if there will be more type of cars or we are thinking of adding new vehicle in the future, we should use factory method to create vehicle
if the pricing is not static and it may vary based on occasion or something then we should use strategy pattern over there.


 */
