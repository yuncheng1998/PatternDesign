package com.fafnir.StatePattern.state;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you have inserted one");
    }

    @Override
    public void ejectCoin() {
        System.out.println("you have turned crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("you have turned it");
    }

    @Override
    public void dispense() {
        System.out.println("Lucky");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setState(gumballMachine.getNoCoinState());
            }
        }

    }

    @Override
    public void printState() {
        System.out.println(this.getClass().getName());
    }
}
