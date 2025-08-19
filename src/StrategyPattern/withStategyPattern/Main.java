package StrategyPattern.withStategyPattern;

import StrategyPattern.withStategyPattern.Strategy.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Strategy pattern.");
        Vehicle vehicle = new PassengerVehicle(new NormalDriveStrategy());
        vehicle.drive();
    }
}
