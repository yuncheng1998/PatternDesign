package com.fafnir.FactoryPattern.FactoryMethodPattern;

class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            System.out.println("ChicagoCheese");
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }
}
