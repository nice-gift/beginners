package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of floors: ");
        int f = scanner.nextInt();
        if (f >= 1 && f <= 4) {
            System.out.println("Малоэтажный дом");
        }else if (f >= 5 && f <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (f > 8) {
            System.out.println("Многоэтажный дом");
        } else  {
            System.out.println("Ошибка ввода");
        }
    }
}
