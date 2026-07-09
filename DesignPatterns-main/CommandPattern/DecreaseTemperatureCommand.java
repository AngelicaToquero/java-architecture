public class DecreaseTemperatureCommand implements Command {
    private TemperatureAdjustable thermostat;

    public DecreaseTemperatureCommand(TemperatureAdjustable thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}
