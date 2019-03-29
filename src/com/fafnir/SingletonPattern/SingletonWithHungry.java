package com.fafnir.SingletonPattern;

/**
 * 饿汉式
 */
public class SingletonWithHungry extends AbstractSingleton{

    private static SingletonWithHungry INSTANCE = new SingletonWithHungry();

    private SingletonWithHungry() {
    }
    public static SingletonWithHungry getInstance() {
        return INSTANCE;
    }
}
