package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Mushroom()};
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
