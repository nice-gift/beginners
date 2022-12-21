package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int countNumEndingByZero = 0;
        int sumNumEndingByZero = 0;
        int min = 10_000;
        int max = 0;

        int[] array = new int[100];
        for (int element:array) {
            element = random.nextInt(10_000);
            if (element % 10 == 0) {
                countNumEndingByZero++;
                sumNumEndingByZero += element;}

            if (element > max) {
                max = element;}

            if (element < min) {
                min = element;}
            System.out.print(element + " ");
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на " +
                "0: " + countNumEndingByZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: "
                + sumNumEndingByZero);
    }
}