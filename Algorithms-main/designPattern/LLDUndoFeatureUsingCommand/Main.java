package LLDUndoFeatureUsingCommand;

import java.util.Stack;

// Command interface
interface Command {
    void execute();
    void undo();
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

// Concrete command
class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

// Concrete command
class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

// Invoker
class RemoteControl {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("No more commands to undo");
        }
    }
}

public class Main {
    public static void main(String [] args) {
        // Receiver
        Light light = new Light();

        // Concrete commands
        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Pressing turn on button
        remoteControl.executeCommand(turnOnCommand);

        // Pressing turn off button
        remoteControl.executeCommand(turnOffCommand);

        // Undo the last command (turn off)
        remoteControl.undoLastCommand();

        // Undo again (turn on)
        remoteControl.undoLastCommand();
    }
}


