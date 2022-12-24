package day11;

public class Warehouse {
    private int counterOrder;
    private int balance;

    public int getCounterOrder() {
        return counterOrder;
    }

    public void setCounterOrder(int counterOrder) {
        this.counterOrder = counterOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse: counterOrder = " + counterOrder +
                ", balance = " + balance;
    }
}
