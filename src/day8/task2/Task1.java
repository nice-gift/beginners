package day8.task2;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1980, 46, 89);
        Airplane airplane3 = new Airplane("Tu", 1960, 40, 109);

        airplane.setYear(1995);
        airplane.setLength(48);
        airplane.fillUp(5);
        airplane.fillUp(80);
        System.out.println(airplane);

        Airplane.compareAirplanes(airplane,airplane3);
    }
}
