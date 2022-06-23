package exp6;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        remoteControl.setCommand(lightCommand);
        remoteControl.buttonWasPressed();
    }
}
