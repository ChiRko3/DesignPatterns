package org.StrategyDesignPattern.WithStrategy.Strategy;

public class SportsDrive implements DriveStrat{
    @Override
    public void drive() {
        System.out.println("Sports Drive Functionality!");
    }
}
