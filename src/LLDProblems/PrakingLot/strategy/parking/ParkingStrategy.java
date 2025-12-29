package LLDProblems.PrakingLot.strategy.parking;

import LLDProblems.PrakingLot.entities.ParkingFloor;
import LLDProblems.PrakingLot.entities.ParkingSpot;
import LLDProblems.PrakingLot.entities.ParkingTicket;
import LLDProblems.PrakingLot.vehicle.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot findSpot(List<ParkingFloor> floors, Vehicle vehicle);
}
