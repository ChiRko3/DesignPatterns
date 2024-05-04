package org.StrategyDesignPattern.WithStrategy;

import org.StrategyDesignPattern.WithStrategy.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDrive());
    }
}
