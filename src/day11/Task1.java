package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i < 1500; i++) {
            courier.doWork();
            picker.doWork();
        }

        System.out.println(warehouse.toString());
        System.out.println("Courier salary " + courier.getSalary());
        System.out.println("Picker salary " + picker.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        courier2.doWork();
        picker2.doWork();

        System.out.println(warehouse.toString());
        System.out.println("Courier salary " + courier.getSalary());
        System.out.println("Picker salary " + picker.getSalary());
        System.out.println(warehouse2.toString());
        System.out.println("Courier2 salary " + courier2.getSalary());
        System.out.println("Picker2 salary " + picker2.getSalary());

    }
}
