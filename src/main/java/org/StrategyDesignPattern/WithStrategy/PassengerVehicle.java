package org.StrategyDesignPattern.WithStrategy;

import org.StrategyDesignPattern.WithStrategy.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDrive());
    }
}
