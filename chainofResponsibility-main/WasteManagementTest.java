public class WasteManagementTest {
    public static void main(String[] args) {
        WasteManagementSystem wasteSystem = new WasteManagementSystem();

        // Sample waste containers
        WasteContainer organicWaste = new WasteContainer("Organic", 50);
        WasteContainer recyclableWaste = new WasteContainer("Recyclable", 30);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous", 10);
        WasteContainer unknownWaste = new WasteContainer("Unknown", 20);

        // Processing waste
        wasteSystem.processWaste(organicWaste);
        wasteSystem.processWaste(recyclableWaste);
        wasteSystem.processWaste(hazardousWaste);
        wasteSystem.processWaste(unknownWaste);
    }
}