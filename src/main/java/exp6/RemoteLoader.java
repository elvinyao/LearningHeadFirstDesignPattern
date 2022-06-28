package exp6;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor door = new GarageDoor();

        LightOnCommand liveRoomLightCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand liveRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(door);

        remoteControl.setCommand(0, liveRoomLightCommand, liveRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

    }
}
