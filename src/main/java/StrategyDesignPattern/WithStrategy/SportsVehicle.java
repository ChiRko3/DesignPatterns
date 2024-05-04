package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDrive());
    }
}
