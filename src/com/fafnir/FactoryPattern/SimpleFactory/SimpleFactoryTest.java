package com.fafnir.FactoryPattern.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.name);
    }
}
