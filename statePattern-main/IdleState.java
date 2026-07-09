class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        machine.setState(new ItemSelectedState());
        System.out.println("Item selected. Please insert coins.");
    }
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Please select an item first.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}