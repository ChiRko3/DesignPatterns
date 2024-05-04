package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDrive());
    }
}
