package com.fafnir.FactoryPattern.SimpleFactory;

class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);

        pizza.brake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
