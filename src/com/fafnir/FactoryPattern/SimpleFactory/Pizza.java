package com.fafnir.FactoryPattern.SimpleFactory;

abstract class Pizza {
    String name;

    void brake() {
        System.out.println("brake");
    }
    void cut() {
        System.out.println("cut");
    }
    void box() {
        System.out.println("box");
    }
}
