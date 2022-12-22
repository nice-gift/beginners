package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYearOfIssue(2010);
        car.setColor("black");
        car.setModel("bmw");

        System.out.print(car.getYearOfIssue() + " ");
        System.out.print(car.getColor() + " ");
        System.out.println(car.getModel());
        System.out.println(car.yearDifference(1822));
        car.info();
    }
}
