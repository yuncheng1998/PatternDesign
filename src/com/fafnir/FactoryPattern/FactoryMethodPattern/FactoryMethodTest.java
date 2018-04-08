package com.fafnir.FactoryPattern.FactoryMethodPattern;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza;
        pizza = newYorkPizzaStore.orderPizza("cheese");
        System.out.println("--------next--------");
        pizza = chicagoPizzaStore.orderPizza("cheese");
    }
}
