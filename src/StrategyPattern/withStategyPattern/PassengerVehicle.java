package StrategyPattern.withStategyPattern;

import StrategyPattern.withStategyPattern.Strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(DriveStrategy driveStrategyObj) {
        super(driveStrategyObj);
    }
}
