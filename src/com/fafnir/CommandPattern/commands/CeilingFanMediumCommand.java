package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.medium();
        System.out.println(ceilingFan.getLocation() + " ceiling speed is " + ceilingFan.speed);
    }
}
