package com.fafnir.MediatorPattern;

public abstract class Colleague {

    private final Long id;

    protected Mediator mediator;

    public Colleague(Long id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    public Long getId() {
        return id;
    }

    public abstract void receive(String msg);

    public abstract void sendMsg(long id, String msg);


}
