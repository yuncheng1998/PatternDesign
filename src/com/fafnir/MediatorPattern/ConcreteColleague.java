package com.fafnir.MediatorPattern;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Long id, Mediator mediator) {
        super(id, mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println(msg);
    }

    @Override
    public void sendMsg(long id, String msg) {
        mediator.operate(1, msg);
    }



}
