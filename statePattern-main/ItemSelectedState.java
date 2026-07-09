class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("An item is already selected.");
    }
    public void insertCoin(VendingMachine machine, double amount) {
        machine.setBalance(machine.getBalance() + amount);
        System.out.println("Inserted " + amount + " coins. Balance: " + machine.getBalance());
        machine.setState(new DispensingState());
        machine.dispenseItem();
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coins before dispensing.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}