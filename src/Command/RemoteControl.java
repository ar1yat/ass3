package Command;
public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChannelCommand;
    private Command previousChannelCommand;

    public RemoteControl(Command turnOnCommand, Command turnOffCommand, Command volumeUpCommand, Command volumeDownCommand,
                         Command nextChannelCommand, Command previousChannelCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.nextChannelCommand = nextChannelCommand;
        this.previousChannelCommand = previousChannelCommand;
    }

    public void pressTurnOn() {
        turnOnCommand.execute();
    }

    public void pressTurnOff() {
        turnOffCommand.execute();
    }

    public void pressVolumeUp() {
        volumeUpCommand.execute();
    }

    public void pressVolumeDown() {
        volumeDownCommand.execute();
    }

    public void pressNextChannel() {
        nextChannelCommand.execute();
    }

    public void pressPreviousChannel() {
        previousChannelCommand.execute();
    }
}
