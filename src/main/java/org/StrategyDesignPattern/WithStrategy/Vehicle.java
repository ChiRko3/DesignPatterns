package org.StrategyDesignPattern.WithStrategy;

import org.StrategyDesignPattern.WithStrategy.Strategy.DriveStrat;

public class Vehicle {
    private DriveStrat driveStrat;

    Vehicle(DriveStrat driveStrat) {
        this.driveStrat = driveStrat;
    }

    public void drive() {
        driveStrat.drive();
    }
}
