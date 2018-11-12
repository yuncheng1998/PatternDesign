package com.fafnir.StatePattern.state;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("wait, gumball will coming");
    }

    @Override
    public void ejectCoin() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Don't turn it again");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        // 根据剩余数量修改状态
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("No gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void printState() {
        System.out.println(this.getClass().getName());
    }
}
