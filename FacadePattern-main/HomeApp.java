public class HomeApp {
    public static void main (String [] args) {
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService aircon = new AirConditioning();

        //facade
        HomeInterface homeInterface = new HomeInterface(light, tv, aircon);

        homeInterface.turnOnAll();
        homeInterface.turnOffAll();

    }
}