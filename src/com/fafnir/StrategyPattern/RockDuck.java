package com.fafnir.StrategyPattern;

class RockDuck extends Duck {
     RockDuck(){    //protected
        quackBehavior = new ZaZaQuack();
        flyBehavior = new FlyWithRock();
    }
}
