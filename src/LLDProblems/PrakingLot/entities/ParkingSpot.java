package LLDProblems.PrakingLot.entities;

import LLDProblems.PrakingLot.vehicle.Vehicle;
import LLDProblems.PrakingLot.vehicle.VehicleType;

public class ParkingSpot {
    private final String parkingSpotId;
    boolean isAvailable;
    private Vehicle parkedVehicle;
    private final VehicleType spotType;

    public ParkingSpot(String parkingId, VehicleType spotType){
        this.parkingSpotId = parkingId;
        this.spotType = spotType;
        this.isAvailable = false;
        this.parkedVehicle = null;
    }

    public void partVehicle(Vehicle vehicle){
        this.isAvailable = true;
        this.parkedVehicle = vehicle;
    }

    public void unparkVehicle(){
        this.isAvailable = false;
        this.parkedVehicle = null;
    }

}
