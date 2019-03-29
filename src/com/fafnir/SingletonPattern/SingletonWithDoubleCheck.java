package com.fafnir.SingletonPattern;

/**
 * 双重校验锁的懒加载
 */
public class SingletonWithDoubleCheck extends AbstractSingleton {

    private static SingletonWithDoubleCheck singletonWithDoubleCheck;
    private SingletonWithDoubleCheck() {}

    public static SingletonWithDoubleCheck getInstance() {
        if (singletonWithDoubleCheck == null) {
            synchronized (SingletonWithDoubleCheck.class) {
                if (singletonWithDoubleCheck == null) {
                    return new SingletonWithDoubleCheck();
                }
            }
        }
        return singletonWithDoubleCheck;
    }
}
