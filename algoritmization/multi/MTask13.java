package by.epam.java.algoritmization.multi;

import java.util.Random;

/**
 * @author potap; Задание 13: Отсортировать столбцы матрицы по возрастаниюи и
 * убыванию значений элементов.
 */

public class MTask13 {
    public static void main(String[] args) {

        int[][] arrayA;
        arrayA = new int[10][10];

        System.out.println("рандомная матрица");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd = new Random();
                arrayA[i][j] = rnd.nextInt(16);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("сортирование по возрастанию столбца:");
        for (int i = 0; i < arrayA[arrayA.length - 1].length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
                for (int k = 0; k < arrayA.length - 1; k++) {
                    if (arrayA[k][i] > arrayA[k + 1][i]) {
                        int temp = arrayA[k][i];
                        arrayA[k][i] = arrayA[k + 1][i];
                        arrayA[k + 1][i] = temp;
                    }
                }
            }
        }

        for (int[] x : arrayA) {
            for (int y : x) {
                System.out.printf(" " + y);
            }
            System.out.println();
        }

        System.out.println("сортирование по убыванию столбца:");
        for (int i = 0; i < arrayA[arrayA.length - 1].length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
                for (int k = 0; k < arrayA.length - 1; k++) {
                    if (arrayA[k][i] < arrayA[k + 1][i]) {
                        int temp = arrayA[k][i];
                        arrayA[k][i] = arrayA[k + 1][i];
                        arrayA[k + 1][i] = temp;
                    }
                }
            }
        }

        for (int[] x : arrayA) {
            for (int y : x) {
                System.out.printf(" " + y);
            }
            System.out.println();
        }
    }
}