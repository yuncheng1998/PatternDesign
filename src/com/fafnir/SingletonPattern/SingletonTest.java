package com.fafnir.SingletonPattern;

public class SingletonTest {
    public static void main(String[] args) {

        /**
         * 普通饿汉式
         */
        boolean result = SingleReflectAttacker.attackWithReflect(SingletonWithHungry.class, SingletonWithHungry.getInstance());
        System.out.println("【饿汉式】反射攻击结果: " + result);
        assert SingletonWithHungry.getInstance() != null;
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithHungry.getInstance());
        System.out.println("【饿汉式】反序列化攻击结果: " + result);

        /**
         * 安全的饿汉式
         */
//        SingleReflectAttacker.attackWithReflect(SingletonWithHungrySafe.class, SingletonWithHungrySafe.getInstance());
        assert SingletonWithHungrySafe.getInstance() != null;
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithHungrySafe.getInstance());
        System.out.println("【安全的饿汉式】反序列化攻击的结果: " + result);


        /**
         * 枚举
         */
//        SingleReflectAttacker.attackWithReflect(SingletonWithEnum.class, SingletonWithEnum.INSTANCE);
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithEnum.INSTANCE);
        System.out.println("【枚举】反序列化攻击的结果: " + result);

        /**
         * 不安全的双重校验锁
         */
        result = SingleReflectAttacker.attackWithReflect(SingletonWithDoubleCheck.class, SingletonWithDoubleCheck.getInstance());
        System.out.println("【双重校验锁】: " + result);
        assert SingletonWithDoubleCheck.getInstance() != null;
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithDoubleCheck.getInstance());
        System.out.println("【双重校验锁】: " + result);

        /**
         * 不安全的静态内部类
         */
        result = SingleReflectAttacker.attackWithReflect(SingletonWithStaticInnerClass.class, SingletonWithStaticInnerClass.getInstance());
        System.out.println("【静态内部类】: " + result);
        assert SingletonWithStaticInnerClass.getInstance() != null;
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithStaticInnerClass.getInstance());
        System.out.println("【静态内部类】: " + result);

        /**
         * 不安全的静态代码块
         */
        result = SingleReflectAttacker.attackWithReflect(SingletonWithHungryStatic.class, SingletonWithHungryStatic.getInstance());
        System.out.println("【静态代码块】: " + result);
        assert SingletonWithHungryStatic.getInstance() != null;
        result = SingleDeserializeAttacker.attackWithDeserialize(SingletonWithHungryStatic.getInstance());
        System.out.println("【静态代码块】: " + result);

    }




}
