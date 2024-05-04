package StrategyDesignPattern.WithStrategy.Strategy;

public class NormalDrive implements DriveStrat{

    @Override
    public void drive() {
        System.out.println("Normal Drive Functionality!");
    }
}
