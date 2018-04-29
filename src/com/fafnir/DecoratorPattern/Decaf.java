package com.fafnir.DecoratorPattern;

public class Decaf extends Beverage {
    Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
