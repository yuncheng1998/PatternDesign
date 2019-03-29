package com.fafnir.SingletonPattern;

public class SingletonWithStaticInnerClass extends AbstractSingleton{

    private SingletonWithStaticInnerClass() {}

    private static class SingletonInstance {
        private static final SingletonWithStaticInnerClass INSTANCE = new SingletonWithStaticInnerClass();
    }

    public static SingletonWithStaticInnerClass getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
