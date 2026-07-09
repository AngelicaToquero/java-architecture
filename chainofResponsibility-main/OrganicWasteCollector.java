public class OrganicWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Collecting organic waste... Capacity: " + container.getCapacity() + " liters");
        } else {
            super.collectWaste(container);
        }
    }
}