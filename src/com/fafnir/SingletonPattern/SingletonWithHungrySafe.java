package com.fafnir.SingletonPattern;

import java.io.Serializable;

public class SingletonWithHungrySafe extends AbstractSingleton {



    private final static SingletonWithHungrySafe INSTANCE = new SingletonWithHungrySafe();

    private SingletonWithHungrySafe() {
        synchronized (SingletonWithHungrySafe.class) {
            if (INSTANCE != null) {
                throw new RuntimeException("单例模式被破坏");
            }
        }

    }
    public static SingletonWithHungrySafe getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }


}
