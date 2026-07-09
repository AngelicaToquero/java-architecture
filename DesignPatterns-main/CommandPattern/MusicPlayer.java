public class MusicPlayer implements VolumeAdjustable, Device {
    @Override
    public void turnOn() {
        System.out.println("Music Player is now On");
    }

    @Override
    public void turnOff() {
        System.out.println("Music Player stopped");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing the volume.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing the volume.");
    }

    public void playPlaylist() {
        System.out.println("Playing favorite playlist.");
    }
}
