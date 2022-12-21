package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int sumMax = Integer.MIN_VALUE;
        int indexMax = 0;

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_000);
        }

        for (int i = 1; i < array.length - 1; i++) {
            int sum = array[i - 1] + array[i] + array[i + 1];
            if (sum > sumMax) {
                sumMax = sum;
                indexMax = i - 1;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная сумма трех соседних элементов: " +
                sumMax + "\n индекс первого элемента: " + indexMax);
    }
}