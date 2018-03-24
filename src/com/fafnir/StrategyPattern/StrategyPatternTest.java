package com.fafnir.StrategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Duck rd = new RockDuck();
        System.out.println(rd.toString());
        rd.setQuackBehavior(new GaGaQuack());
        System.out.println(rd.toString());
    }
}
