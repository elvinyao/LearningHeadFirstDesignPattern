package exp6;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}

