package LLDProblems.PrakingLot;

import LLDProblems.PrakingLot.entities.ParkingFloor;
import LLDProblems.PrakingLot.entities.ParkingSpot;
import LLDProblems.PrakingLot.entities.ParkingTicket;
import LLDProblems.PrakingLot.strategy.parking.ParkingStrategy;
import LLDProblems.PrakingLot.vehicle.Bike;
import LLDProblems.PrakingLot.vehicle.Car;
import LLDProblems.PrakingLot.vehicle.Vehicle;
import LLDProblems.PrakingLot.vehicle.VehicleType;

public class ParkingLotApplication {
    public static void execute(){
        ParkingLot parkinglot = ParkingLot.getInstance();

        ParkingSpot spot1 = new ParkingSpot("spot1", VehicleType.MEDIUM);
        ParkingSpot spot2 = new ParkingSpot("spot2", VehicleType.MEDIUM);
        ParkingSpot spot3 = new ParkingSpot("spot3", VehicleType.LARGE);
        ParkingSpot spot4 = new ParkingSpot("spot4", VehicleType.SMALL);

        ParkingFloor parkingFloor1 = new ParkingFloor(1);
        parkingFloor1.addSpot("spot1", spot1);
        parkingFloor1.addSpot("spot2", spot2);
        parkingFloor1.addSpot("spot3", spot3);
        parkingFloor1.addSpot("spot4", spot4);


        ParkingSpot spot21 = new ParkingSpot("spot21", VehicleType.MEDIUM);
        ParkingSpot spot22 = new ParkingSpot("spot22", VehicleType.MEDIUM);
        ParkingSpot spot23 = new ParkingSpot("spot23", VehicleType.LARGE);
        ParkingSpot spot24 = new ParkingSpot("spot24", VehicleType.SMALL);

        ParkingFloor parkingFloor2 = new ParkingFloor(2);
        parkingFloor1.addSpot("spot21", spot21);
        parkingFloor1.addSpot("spot22", spot22);
        parkingFloor1.addSpot("spot23", spot23);
        parkingFloor1.addSpot("spot24", spot24);

        parkinglot.addFloor(parkingFloor1);
        parkinglot.addFloor(parkingFloor2);

        Vehicle car1 = new Car("GJ-03-2323");
        Vehicle bike1 = new Bike("MH_12-3239");

        ParkingTicket ticket1 = parkinglot.parkVehicle(car1);
        float fee = parkinglot.UnParkVehicle(ticket1);

        parkinglot.pay(fee);

    }
}
