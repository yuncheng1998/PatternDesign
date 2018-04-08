package com.fafnir.FactoryPattern.FactoryMethodPattern;

abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
