public class VendingMachine {
    private double balance;
    private VendingMachineState state;

    public VendingMachine() {
        this.balance = 0;
        this.state = new IdleState(); // Default state
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(double amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
}