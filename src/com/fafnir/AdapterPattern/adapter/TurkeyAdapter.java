package com.fafnir.AdapterPattern.adapter;

import com.fafnir.AdapterPattern.adaptee.Turkey;
import com.fafnir.AdapterPattern.target.Duck;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
