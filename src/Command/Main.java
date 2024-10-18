package Command;
public class Main {
    public static void main(String[] args) {
        // Создание объекта телевизора
        Television television = new Television();

        // Создание команд для управления телевизором
        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command volumeUp = new VolumeUpCommand(television);
        Command volumeDown = new VolumeDownCommand(television);
        Command nextChannel = new NextChannelCommand(television);
        Command previousChannel = new PreviousChannelCommand(television);

        // Создание пульта управления и привязка кнопок к командам
        RemoteControl remote = new RemoteControl(turnOn, turnOff, volumeUp, volumeDown, nextChannel, previousChannel);

        // Использование пульта для управления телевизором
        remote.pressTurnOn();
        remote.pressVolumeUp();
        remote.pressNextChannel();
        remote.pressPreviousChannel();
        remote.pressVolumeDown();
        remote.pressTurnOff();
    }
}

