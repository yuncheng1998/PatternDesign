package com.fafnir.MediatorPattern;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {

    Map<Long, Colleague> map = new HashMap<>();

    public void register(Colleague mediator) {
        map.put(mediator.getId(), mediator);
    }

    public abstract void operate(long id, String msg);
}
