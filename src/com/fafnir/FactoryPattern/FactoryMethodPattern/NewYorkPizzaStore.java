package com.fafnir.FactoryPattern.FactoryMethodPattern;

class NewYorkPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            System.out.println("NewYorkCheese");
            pizza = new NewYorkCheesePizza();
        }
        return pizza;
    }
}
