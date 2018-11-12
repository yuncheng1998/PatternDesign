package com.fafnir.StatePattern.state;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No gumballs, Don't insert Coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No Coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turn and No Gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs");
    }

    @Override
    public void printState() {
        System.out.println(this.getClass().getName());
    }
}
