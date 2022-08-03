package com.fafnir.MediatorPattern;

public class ConcreteMediator extends Mediator {

    @Override
    public void operate(long id, String msg) {
        map.get(id).receive(msg);
    }
}
