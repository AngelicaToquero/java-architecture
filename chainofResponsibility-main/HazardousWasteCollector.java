public class HazardousWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Collecting hazardous waste... Capacity: " + container.getCapacity() + " liters");
        } else {
            super.collectWaste(container);
        }
    }
}