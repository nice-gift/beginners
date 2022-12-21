package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size;
        int sum = 0;
        int countNumBiggerEight = 0;
        int countNumOne = 0;
        int countOddNum = 0;
        int countEvenNum = 0;

        do {
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
            if (array[i] == 1) {
                countNumOne++;
            }
            if (array[i] % 2 == 0) {
                countEvenNum++;
            } else {
                countOddNum++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + size);
        System.out.println("Количество чисел больше 8: " + countNumBiggerEight);
        System.out.println("Количество чисел равных 1: " + countNumOne);
        System.out.println("Количество нечетных чисел: " + countOddNum);
        System.out.println("Количество четных чисел: " + countEvenNum);
        System.out.println("Сумма всех элементов массива: " + sum);
        scanner.close();
    }
}
