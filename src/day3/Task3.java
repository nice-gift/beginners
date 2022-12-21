package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите два числа: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) {
                System.out.println("Деление на ноль");
                continue;
            }

            System.out.println(x / y);
        }
        scanner.close();
    }
}
