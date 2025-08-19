package StrategyPattern.withStategyPattern;

import StrategyPattern.withStategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
