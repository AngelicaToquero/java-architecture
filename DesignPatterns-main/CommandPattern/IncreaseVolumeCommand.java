public class IncreaseVolumeCommand implements Command {
    private VolumeAdjustable volumeAdjustable;

    public IncreaseVolumeCommand(VolumeAdjustable volumeAdjustable) {
        this.volumeAdjustable = volumeAdjustable;
    }

    @Override
    public void execute() {
        volumeAdjustable.increaseVolume();
    }
}
