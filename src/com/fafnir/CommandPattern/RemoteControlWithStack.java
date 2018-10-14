package com.fafnir.CommandPattern;

import com.fafnir.CommandPattern.commands.*;

import java.util.Stack;

public class RemoteControlWithStack {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commands;


    RemoteControlWithStack() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        commands = new Stack<>();
    }

    void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        commands.push(onCommands[slot]);
    }
    void offButtonWasPushed(int slot) {
        onCommands[slot].execute();
        commands.push(onCommands[slot]);
    }
    void undoButtonWasPushed() {
        if (commands.peek() != null)
        commands.pop().undo();
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
