package com.fafnir.DecoratorPattern;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}