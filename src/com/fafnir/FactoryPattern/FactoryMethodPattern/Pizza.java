package com.fafnir.FactoryPattern.FactoryMethodPattern;

public abstract class Pizza {
    String name;

    void bake() {
        System.out.println("bake");
    }
    void cut() {
        System.out.println("cut");
    }
    void box() {
        System.out.println("box");
    }
}

