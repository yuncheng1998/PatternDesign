package com.fafnir.SingletonPattern;

public class SingletonWithHungrySafe extends AbstractSingleton{

    private static boolean flag = true;

    private final static SingletonWithHungrySafe INSTANCE = new SingletonWithHungrySafe();

    private SingletonWithHungrySafe() {
        synchronized (SingletonWithHungrySafe.class) {
            if (flag) {
                flag = false;
            } else {
                throw new RuntimeException("单例模式破坏");
            }
        }

    }
    public static SingletonWithHungrySafe getInstance() {
        return INSTANCE;
    }


}
