package com.fafnir.DecoratorPattern;

public class StarBucks {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Order(beverage);

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        Order(beverage1);

        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        Order(beverage2);
    }

    private static void Order(Beverage beverage1) {
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
