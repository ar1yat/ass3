package Command;
public class Television {
    private int volume = 10;
    private int channel = 1;

    public void turnOn() {
        System.out.println("The TV is ON.");
    }

    public void turnOff() {
        System.out.println("The TV is OFF.");
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Volume is at maximum!");
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Volume is at minimum!");
        }
    }

    public void nextChannel() {
        channel++;
        System.out.println("Channel is now: " + channel);
    }

    public void previousChannel() {
        if (channel > 1) {
            channel--;
            System.out.println("Channel is now: " + channel);
        } else {
            System.out.println("This is the first channel!");
        }
    }
}

