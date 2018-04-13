package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
    private Pizza pizza = null;

    @Override
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago style cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style clam Pizza");
        }
        return pizza;
    }
}
