package com.fafnir.FactoryPattern.SimpleFactory;

class SimplePizzaFactory {
    static Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            System.out.println("creating CheesePizza");
            pizza = new CheesePizza();
        }else if(type.equals("pepperoniPizza")) {
            System.out.println("creating PepperoniPizza");
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
