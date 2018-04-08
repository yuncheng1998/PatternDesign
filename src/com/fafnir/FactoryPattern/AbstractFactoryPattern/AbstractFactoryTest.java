package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Pizza pizza;
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        pizza = newYorkPizzaStore.createPizza("cheese");
        System.out.println(pizza.getName());
        System.out.println("----next-----");
        pizza = newYorkPizzaStore.createPizza("clam");
        System.out.println(pizza.getName());
    }
}
