package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = random.nextInt(15);
        }

        System.out.print(Arrays.toString(array1));
        System.out.println();
        System.out.print(Arrays.toString(array2));
        System.out.println();

        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        if (sum1 / array1.length > sum2 / array2.length) {
            System.out.println("Среднее арифметическое элементов первого массива больше, чем среднее" +
                    " арифметическое втрого массива");
        } else if (sum1 / array1.length < sum2 / array2.length) {
            System.out.println("Среднее арифметическое элементов первого массива меньше, чем среднее " +
                    "арифметическое второго массива");
        } else {
            System.out.println("Средние арифметические элементов обоих массивов равны");
        }
    }
}
