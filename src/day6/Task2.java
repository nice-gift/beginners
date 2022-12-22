package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Being", 1980, 46, 89);

        airplane.setYear(1995);
        airplane.setLength(48);
        airplane.fillUp(5);
        airplane.fillUp(80);
        airplane.info();
    }
}
