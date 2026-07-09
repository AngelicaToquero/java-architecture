public class Main {
    public static void main(String[] args) {
        //Devices
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        //Adapters
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        laptopAdapter.plugIn();          
        refrigeratorAdapter.plugIn();    
        smartphoneAdapter.plugIn();      
    }
}