package com.fafnir.StatePattern.gumballMachine;

import com.fafnir.StatePattern.state.*;

public class GumballMachine {
    private State soldOutState;
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State winnerState;

    private int count;
    private State state;

    public int getCount() {
        return count;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } else {
            state = soldOutState;
        }
    }
    // 对于Machine中的count属性进行修改,因此将该方法写在GumballMachine中
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count = count-1;
        }
    }
    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
