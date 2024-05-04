package org.StrategyDesignPattern.WithStrategy;

import org.StrategyDesignPattern.WithStrategy.Strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDrive());
    }
}
