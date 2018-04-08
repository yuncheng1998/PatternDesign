package com.fafnir.FactoryPattern.AbstractFactoryPattern;

class CheesePizza extends Pizza{
    private PizzaIngredientFactory pizzaIngredientFactory;

    CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.pizzaIngredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing " + super.getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }


}
