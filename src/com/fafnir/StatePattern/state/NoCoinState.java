package com.fafnir.StatePattern.state;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

public class NoCoinState implements State {
    private GumballMachine gumballMachine;
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("insert a coin");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("No coin, can't turn");
    }

    @Override
    public void dispense() {
        System.out.println("need coin");
    }

    @Override
    public void printState() {
        System.out.println(this.getClass().getName());
    }
}
