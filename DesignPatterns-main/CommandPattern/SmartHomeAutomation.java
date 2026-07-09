public class SmartHomeAutomation {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command increaseTemp = new IncreaseTemperatureCommand(thermostat);
        Command decreaseTemp = new DecreaseTemperatureCommand(thermostat);
        Command playMusic = new PlayMusicCommand(musicPlayer);
        Command increaseVolume = new IncreaseVolumeCommand(musicPlayer);
        Command decreaseVolume = new DecreaseVolumeCommand(musicPlayer);

        CentralHub hub = new CentralHub();

        // Test
        hub.setCommand(lightOn);
        hub.pressButton();

        hub.setCommand(lightOff);
        hub.pressButton();

        hub.setCommand(increaseTemp);
        hub.pressButton();

        hub.setCommand(decreaseTemp);
        hub.pressButton();

        hub.setCommand(playMusic);
        hub.pressButton();

        hub.setCommand(increaseVolume);
        hub.pressButton();

        hub.setCommand(decreaseVolume);
        hub.pressButton();
    }
}
