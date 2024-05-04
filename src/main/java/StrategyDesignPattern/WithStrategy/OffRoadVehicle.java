package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDrive());
    }
}
