package com.fafnir.StatePattern;

import com.fafnir.StatePattern.gumballMachine.GumballMachine;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
//        System.out.println(gumballMachine);
        gumballMachine.insertCoin();
        gumballMachine.getState().printState();
        gumballMachine.ejectCoin();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

    }

}
