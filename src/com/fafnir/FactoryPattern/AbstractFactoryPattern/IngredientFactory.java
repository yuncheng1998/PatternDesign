package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Clams createClams();
}
