package com.fafnir.DecoratorPattern;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
