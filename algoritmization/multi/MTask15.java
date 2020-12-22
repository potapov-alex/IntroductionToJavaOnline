package by.epam.java.algoritmization.multi;

import java.util.Random;

/**
 * @author potap; найти наибольший эл-т матрицы и заменить все нечетные на него
 * <p>
 * хардкод: размер массива 10*10; макс значение массива 99.
 */

public class MTask15 {
    public static void main(String[] args) {

        int[][] arrayA;
        arrayA = new int[10][10];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd = new Random();
                arrayA[i][j] = rnd.nextInt(100);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        int max;
        max = 0;
        for (int[] x : arrayA) {
            for (int y : x) {
                if (y > max) {
                    max = y;
                }
            }
        }

        System.out.println("Максимальный элемент = " + max);

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (arrayA[i][j] % 2 != 0) {
                    arrayA[i][j] = max;
                }
            }
        }

        System.out.println("Массив после изменения имеет вид:");
        for (int[] x : arrayA) {
            for (int y : x) {
                System.out.print(" " + y);
            }
            System.out.println();
        }
    }
}