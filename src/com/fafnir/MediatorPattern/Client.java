package com.fafnir.MediatorPattern;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague colleagueA = new ConcreteColleague(1L, mediator);
        ConcreteColleague colleagueB = new ConcreteColleague(2L, mediator);
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.sendMsg(2L, "msg");


    }
}
