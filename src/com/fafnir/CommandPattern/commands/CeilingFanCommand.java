package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.CeilingFan;

public class CeilingFanCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
        System.out.println(ceilingFan.getLocation() + " ceiling speed is " + ceilingFan.speed);
    }
}
