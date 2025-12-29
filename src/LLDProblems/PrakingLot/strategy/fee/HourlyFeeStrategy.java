package LLDProblems.PrakingLot.strategy.fee;

import LLDProblems.PrakingLot.entities.ParkingTicket;

public class HourlyFeeStrategy implements FeeStrategy{

    @Override
    public float calculateFee(ParkingTicket parkingTicket){
        System.out.println("Calculated fee by hourly based fee strategy");
        return 200;
    }
}
