package com.fafnir.StatePattern.state;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

import java.util.Random;

// 已经塞入一枚硬币
public class HasCoinState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    // 不能再投入硬币
    @Override
    public void insertCoin() {
        System.out.println("can't insert another coin");
    }
    // 退换硬币后将状态转换到无硬币
    @Override
    public void ejectCoin() {
        System.out.println("coin return");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
    // 转动手柄，状态变为商品售出
    @Override
    public void turnCrank() {
        System.out.println("turned the crank");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    // 发放糖果
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void printState() {
        System.out.println(this.getClass().getName());
    }
}
