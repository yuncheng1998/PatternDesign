package com.fafnir.FactoryPattern.AbstractFactoryPattern;

abstract class PizzaStore {

    void orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(this.getInfo(pizza));
    }

    private String getInfo(Pizza pizza) {
        return "Ingredients are " + pizza.dough.getName() + ", " + pizza.sauce.getName();
    }

    protected abstract Pizza createPizza(String type);
}
