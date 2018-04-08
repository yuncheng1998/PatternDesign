package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public  Clams createClams();
}
