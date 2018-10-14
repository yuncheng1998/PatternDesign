package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.off();
        System.out.println(ceilingFan.getLocation() + " ceiling speed is " + ceilingFan.speed);
    }
}
