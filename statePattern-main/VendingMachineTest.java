public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectItem(); 
        vendingMachine.insertCoin(1.0); 
        vendingMachine.selectItem(); 
        vendingMachine.insertCoin(0.5); 
        vendingMachine.setOutOfOrder(); 
        vendingMachine.selectItem(); 
    }
}