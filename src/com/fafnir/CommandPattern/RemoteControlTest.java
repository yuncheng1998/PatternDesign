package com.fafnir.CommandPattern;

import com.fafnir.CommandPattern.appliances.*;
import com.fafnir.CommandPattern.commands.*;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("LivingRoom");
        Stereo stereo = new Stereo("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
    }
}
