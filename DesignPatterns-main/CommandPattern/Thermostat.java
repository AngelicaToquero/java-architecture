public class Thermostat implements TemperatureAdjustable, Device {
    @Override
    public void increaseTemperature() {
        System.out.println("Thermostat temperature increased");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Thermostat temperature decreased");
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is Off");
    }
}
