package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y != 0) {
            System.out.println(x / y);
        } else {
            scanner.close();
            System.out.println("Работа программы завершается");
        }

    }
}
