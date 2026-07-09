public class HomeInterface {
    private HomeService homeServicelight;
    private HomeService homeServicetv;
    private HomeService homeServiceaircon;

    public HomeInterface(HomeService homeServicelight, HomeService homeServicetv, HomeService homeServiceaircon) {
        this.homeServicelight = homeServicelight;
        this.homeServicetv = homeServicetv;
        this.homeServiceaircon = homeServiceaircon;
    }
    public void turnOnAll() {
        homeServicelight.turnOn();
        homeServicetv.turnOn();
        homeServiceaircon.turnOn();
    }
    public void turnOffAll() {
        homeServicelight.turnOff();
        homeServicetv.turnOff();
        homeServiceaircon.turnOff();
    }
}