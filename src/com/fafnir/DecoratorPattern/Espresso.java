package com.fafnir.DecoratorPattern;

public class Espresso extends Beverage {

    Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
