package LLDProblems.PrakingLot.vehicle;

public abstract class Vehicle {

    public final String vehicleNumber;
    public final VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

}
