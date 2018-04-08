package com.fafnir.FactoryPattern.FactoryMethodPattern;

class ChicagoCheesePizza extends Pizza {
    ChicagoCheesePizza() {
        name = "ChicagoCheesePizza";
    }

    @Override
    void cut() {
        System.out.println("cutting pizza into square slices");
    }
}
