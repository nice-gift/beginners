package day7.task1;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Being", 1980, 46, 89);
        Airplane airplane3 = new Airplane("Tu", 1960, 40, 109);

        airplane.setYear(1995);
        airplane.setLength(48);
        airplane.fillUp(5);
        airplane.fillUp(80);
        airplane.info();

        Airplane.compareAirplanes(airplane,airplane3);
    }
}
