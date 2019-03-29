package com.fafnir.SingletonPattern;

import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) {

        /**
         * 普通饿汉式
         */
        try {
            Class<?> classType = SingletonWithHungry.class;
            boolean result = SingleReflectAttacker.attackWithReflect(classType, SingletonWithHungry.getInstance());
            System.out.println(classType.getName() + ": " + result);

        } catch (NoSuchMethodException | IllegalAccessException |
                InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }

        /**
         * 安全的饿汉式
         */
//        try {
//            Class<?> classType = SingletonWithHungrySafe.class;
//            boolean result = SingleReflectAttacker.attackWithReflect(classType, SingletonWithHungrySafe.getInstance());
//            System.out.println(classType.getName() + ": " + result);
//
//        } catch (NoSuchMethodException | IllegalAccessException |
//                InvocationTargetException | InstantiationException e) {
//            e.printStackTrace();
//        }
        /**
         * 枚举
         */
        try {
            Class<?> classType = SingletonWithEnum.class;
            boolean result = SingleReflectAttacker.attackWithReflect(classType, SingletonWithEnum.INSTANCE);
            System.out.println(classType.getName() + ": " + result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




}
