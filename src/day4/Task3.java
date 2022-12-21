package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int sumMax = Integer.MIN_VALUE;
        int indexMax = 0;

        int[][] array = new int[12][8];
        for (int m = 0; m < array.length; m++) {
            int sum = 0;
            for (int n = 0; n < array[0].length; n++) {
                array[m][n] = random.nextInt(50);
                sum += array[m][n];
            }
            if (sum > sumMax) {
                sumMax = sum;
                indexMax = m;
            }
            System.out.println(sum);
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Максимальная сумма чисел в строке: " + sumMax +
                "\n индекс строки, сумма чисел в которой максимальна: " + indexMax);
    }
}