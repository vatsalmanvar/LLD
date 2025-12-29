package LLDProblems.PrakingLot.entities;

import LLDProblems.PrakingLot.vehicle.Vehicle;
import LLDProblems.PrakingLot.vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {

    public String parkingTicketId;
    public Vehicle vehicle;
    public ParkingSpot spot;
    public LocalDateTime entryTime;
    public LocalDateTime exitTime;
    public VehicleType vehicleType;

    public ParkingTicket(Vehicle vehicle, ParkingSpot spot){
        this.parkingTicketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
        entryTime = LocalDateTime.now();
        this.spot = spot;
    }

}
