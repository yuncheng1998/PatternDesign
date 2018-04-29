package com.fafnir.DecoratorPattern;

public class HouseBlend extends Beverage {
    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
