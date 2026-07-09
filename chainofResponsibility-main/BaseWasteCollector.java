public abstract class BaseWasteCollector implements WasteCollector {
    protected WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No suitable waste collector found for " + container.getType());
        }
    }
}
