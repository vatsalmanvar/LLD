package LLDProblems.CarRentalSystem;

import LLDProblems.CarRentalSystem.emuns.CarStatus;
import LLDProblems.CarRentalSystem.emuns.CarType;

public class Car {

    String carNumber;
    CarType type;
    CarStatus status;

    public Car(String carNumber, CarType type){
        this.carNumber=carNumber;
        this.type=type;
        this.status=CarStatus.AVAILABLE;
    }



}
