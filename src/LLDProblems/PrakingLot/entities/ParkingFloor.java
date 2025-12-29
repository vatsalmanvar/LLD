package LLDProblems.PrakingLot.entities;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {

    private final int parkingNumber;
    private final Map<String, ParkingSpot> spots;

    public ParkingFloor(int parkingNumber){
        this.parkingNumber = parkingNumber;
        spots = new HashMap<String, ParkingSpot>();
    }

    public void addSpot(String spotId, ParkingSpot spot){
        spots.put(spotId, spot);
    }

}
