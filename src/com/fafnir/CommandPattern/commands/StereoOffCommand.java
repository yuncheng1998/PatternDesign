package com.fafnir.CommandPattern.commands;

import com.fafnir.CommandPattern.appliances.Stereo;
import com.fafnir.CommandPattern.commands.Command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
