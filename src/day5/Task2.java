package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2020, "black", "bmw");

        System.out.print(motorbike.getYearOfIssue() + " ");
        System.out.print(motorbike.getColor() + " ");
        System.out.print(motorbike.getModel());
    }
}
