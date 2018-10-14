package com.fafnir.CommandPattern;

import com.fafnir.CommandPattern.appliances.*;
import com.fafnir.CommandPattern.commands.*;

public class RemoteLoader {
    public static void main(String[] args) {

//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        RemoteControlWithStack remoteControl = new RemoteControlWithStack();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommands(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommands(2, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommands(3, ceilingFanLow, ceilingFanOff);

        // 开灯
        remoteControl.onButtonWasPushed(0);
        // 吊扇高速
        remoteControl.onButtonWasPushed(1);
        // 吊扇中速
        remoteControl.onButtonWasPushed(2);
        // 当前状态
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl.toString());


        // party Macro
        /*Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        Command[] partyOn = {stereoOn, ceilingFanHigh};
        MacroCommand partyOnMarco = new MacroCommand(partyOn);
        Command[] partyOff = {stereoOff, ceilingFanOff};
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommands(1, partyOnMarco, partyOffMacro);
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl.toString());
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl.toString());*/

    }
}
