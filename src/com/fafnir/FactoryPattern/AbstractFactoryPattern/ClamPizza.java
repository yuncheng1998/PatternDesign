package com.fafnir.FactoryPattern.AbstractFactoryPattern;

class ClamPizza extends Pizza {
    private IngredientFactory pizzaIngredientFactory;

    ClamPizza(IngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + super.getName());
        dough = pizzaIngredientFactory.createDough();
//        System.out.println(this.dough.getName());

        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
