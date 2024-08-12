public class SmartTv {
    boolean on = false;
    int channel = 0;
    int volume = 0;

    public void turnOn() {
        on = true;
        channel = 1;
        volume = 25;
    }

    public void turnOff() {
        on = false;
        channel = 0;
        volume = 0;
    }

    public void upVolume() {
        volume++;
    }

    public void downVolume() {
        volume--;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void upChannel() {
        channel++;
    }

    public void downChannel() {
        channel--;
    }
}