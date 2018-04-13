package com.fafnir.FactoryPattern.AbstractFactoryPattern;

public abstract class Pizza {
    private String name;
    public Dough dough;
    public Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("bake");
    }
    void cut() {
        System.out.println("cut");
    }
    void box() {
        System.out.println("box");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
