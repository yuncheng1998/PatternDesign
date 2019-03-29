package com.fafnir.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleReflectAttacker {

    public static boolean attackWithReflect(Class<?> classType, AbstractSingleton instance)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<?> c = classType.getDeclaredConstructor();
        c.setAccessible(true);
        Object instanceFromReflect = c.newInstance();
        return instance == instanceFromReflect;
    }

    public static boolean attackWithReflect(Class<?> classType, SingletonWithEnum instance)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException, ClassNotFoundException {

        /**
         * 枚举没有构造器，失败
         */
//        Constructor<?> c = classType.getDeclaredConstructor();
//        c.setAccessible(true);
//        Object instanceFromReflect = c.newInstance();
//        return instance == instanceFromReflect;

        SingletonWithEnum singletonWithEnum = (SingletonWithEnum) Class.forName(classType.getName()).newInstance();


        return false;
    }

}
