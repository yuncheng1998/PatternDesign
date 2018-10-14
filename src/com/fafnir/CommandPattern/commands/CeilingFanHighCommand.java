package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
        System.out.println(ceilingFan.getLocation() + " ceiling speed is " + ceilingFan.speed);
    }
}
