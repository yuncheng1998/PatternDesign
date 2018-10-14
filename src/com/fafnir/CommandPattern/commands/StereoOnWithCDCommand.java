package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.Stereo;
import com.fafnir.CommandPattern.commands.Command;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
