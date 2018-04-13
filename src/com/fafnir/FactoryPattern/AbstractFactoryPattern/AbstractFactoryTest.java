package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        newYorkPizzaStore.orderPizza("cheese");
        System.out.println("----next-----");
        newYorkPizzaStore.orderPizza("clam");

        System.out.println("----next-----");
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println("----next-----");
        chicagoPizzaStore.orderPizza("clam");
        System.out.println("----next-----");

    }
}
