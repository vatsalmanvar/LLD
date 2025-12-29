package LLDProblems.PrakingLot.strategy.parking;

import LLDProblems.PrakingLot.entities.ParkingFloor;
import LLDProblems.PrakingLot.entities.ParkingSpot;
import LLDProblems.PrakingLot.vehicle.Vehicle;
import LLDProblems.PrakingLot.vehicle.VehicleType;

import java.util.List;

public class FarthestFirstParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingFloor> floors, Vehicle vehicle){
        return new ParkingSpot("1-Farthest", VehicleType.MEDIUM);
    }
}
