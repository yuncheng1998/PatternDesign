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

    public static boolean attackWithReflect(Class<?> classType, SingletonWithEnum instance) {

        /**
         *
         */

        attackWithReflectMethod1(classType);
        attackWithReflectMethod2(classType);
        return true;
    }

    public static void attackWithReflectMethod1(Class<?> classType) {
        try {
            Class.forName(classType.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void attackWithReflectMethod2(Class<?> classType) {
        try {
            Constructor[] constructors = classType.getDeclaredConstructors();
            for (Constructor c : constructors) {
                c.setAccessible(true);
                c.newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
