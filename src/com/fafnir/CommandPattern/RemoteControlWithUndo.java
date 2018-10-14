package com.fafnir.CommandPattern;

import com.fafnir.CommandPattern.commands.*;

public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    void undoButtonWasPushed() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------------Remote Control---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot").append(i).append("]").append(onCommands[i].getClass().getName()).append(" ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
