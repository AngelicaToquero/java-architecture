public class WasteManagementSystem {
    private WasteCollector chain;

    public WasteManagementSystem() {
        // Creating collectors
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        // Setting up the Chain of Responsibility
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // First handler in the chain
        this.chain = organicCollector;
    }

    public void processWaste(WasteContainer container) {
        chain.collectWaste(container);
    }
}