package com.fafnir.SingletonPattern;

/**
 * 饿汉式，静态代码块
 */
public class SingletonWithHungryStatic extends AbstractSingleton{
    private static SingletonWithHungryStatic INSTANCE;
    static {
        INSTANCE = new SingletonWithHungryStatic();
    }
    private SingletonWithHungryStatic(){}

    public static SingletonWithHungryStatic getInstance() {
        return INSTANCE;
    }

}
