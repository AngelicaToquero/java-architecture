class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing an item.");
    }
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Please wait until the current item is dispensed.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setBalance(0);
        machine.setState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}