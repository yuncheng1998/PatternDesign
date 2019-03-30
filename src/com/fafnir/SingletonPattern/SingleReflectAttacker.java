package com.fafnir.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleReflectAttacker {

    public static boolean attackWithReflect(Class<?> classType, AbstractSingleton instance) {

        Constructor<?> c = null;
        Object instanceFromReflect = null;
        try {
            c = classType.getDeclaredConstructor();
            c.setAccessible(true);
            instanceFromReflect = c.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return instance != instanceFromReflect;
    }

}
