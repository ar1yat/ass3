package Command;
public class VolumeDownCommand implements Command {
    private Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeDown();
    }
}
