package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
        System.out.println(ceilingFan.getLocation() + " ceiling speed is " + ceilingFan.speed);
    }
}
