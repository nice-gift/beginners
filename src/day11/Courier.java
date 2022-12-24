package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.balance += 1000;
        if (warehouse.balance == 1_000_000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
        System.out.println("Courier got bonus");
    }
}
