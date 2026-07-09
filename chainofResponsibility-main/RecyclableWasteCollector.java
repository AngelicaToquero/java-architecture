public class RecyclableWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Collecting recyclable waste... Capacity: " + container.getCapacity() + " liters");
        } else {
            super.collectWaste(container);
        }
    }
}
