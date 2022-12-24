package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCounterOrder(warehouse.getCounterOrder() + 1);
        if (warehouse.getCounterOrder() == 1500) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
        System.out.println("Picker got bonus");
    }

    @Override
    public String toString() {
        return "Picker salary " + salary;
    }
}
