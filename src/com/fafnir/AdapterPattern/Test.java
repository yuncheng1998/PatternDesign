package com.fafnir.AdapterPattern;

import com.fafnir.AdapterPattern.adaptee.WildTurkey;
import com.fafnir.AdapterPattern.adapter.TurkeyAdapter;
import com.fafnir.AdapterPattern.target.*;

public class Test {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        System.out.println("True Duck:");
        duck.quack();
        duck.fly();
        System.out.println("==============================");
        // 将火鸡伪装为鸭子，提供一个面向火鸡接口的适配器，得到一个鸭子对象
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Duck from turkeyAdapter:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
