package LLDProblems.PrakingLot;

import LLDProblems.PrakingLot.entities.ParkingFloor;
import LLDProblems.PrakingLot.entities.ParkingSpot;
import LLDProblems.PrakingLot.entities.ParkingTicket;
import LLDProblems.PrakingLot.strategy.fee.FeeStrategy;
import LLDProblems.PrakingLot.strategy.fee.FlatRateFeeStrategy;
import LLDProblems.PrakingLot.strategy.parking.BestFitParkingStrategy;
import LLDProblems.PrakingLot.strategy.parking.ParkingStrategy;
import LLDProblems.PrakingLot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot instance;
    private final List<ParkingFloor> floors = new ArrayList<>();
    private FeeStrategy feeStrategy;
    private ParkingStrategy parkingStrategy;

    private ParkingLot(){
        this.feeStrategy = new FlatRateFeeStrategy();
        this.parkingStrategy = new BestFitParkingStrategy();
    }

    //Singleton design pattern
    public static ParkingLot getInstance(){
        if(instance == null) instance = new ParkingLot();
        return instance;
    }

    public void addFloor(ParkingFloor parkingFloor){
        floors.add(parkingFloor);
    }

    public ParkingTicket parkVehicle(Vehicle vehicle){
        ParkingSpot spot = parkingStrategy.findSpot(floors, vehicle);
        spot.partVehicle(vehicle);
        return new ParkingTicket(vehicle, spot);
    }

    public float UnParkVehicle(ParkingTicket ticket){
        ticket.spot.unparkVehicle();
        return feeStrategy.calculateFee(ticket);
    }

    public void pay(float amount){
        System.out.println("Paid the fees of "+amount);
    }


}

/*
Parking Lot System

“So we’ll design a single in-memory parking lot system that supports multiple vehicle types,
allocates appropriate parking spots, tracks real-time availability, calculates parking fees based on
duration and vehicle type, and supports multiple extensible payment options at exit time.”

Entities:
1) Parking lot
2) vehicle
3) parking spot
4) parking fee calculator
5) payment

7) ticket
8) entry gate
9) exit gate
10) payment method

strategy design pattern for fee calculation and payment
factory design pattern for payment method creation and vehicle creation


 */
