package by.epam.java.algoritmization.multi;

import java.util.Random;

/**
 * @author potap; Задание 12: Отсортировать строки матрицы по возрастаниюи и
 * убыванию значений элементов.
 * <p>
 * хардкод: макс значение рандома 15
 */

public class MTask12 {
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

        System.out.println("сортивание по возрастанию строки:");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                for (int k = 0; k < arrayA[i].length - 1; k++) {
                    if (arrayA[i][k] > arrayA[i][k + 1]) {
                        int temp = arrayA[i][k];
                        arrayA[i][k] = arrayA[i][k + 1];
                        arrayA[i][k + 1] = temp;
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

        System.out.println("сортивание по убыванию строки:");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                for (int k = arrayA[i].length - 1; k > 0; k--) {
                    if (arrayA[i][k] > arrayA[i][k - 1]) {
                        int temp = arrayA[i][k];
                        arrayA[i][k] = arrayA[i][k - 1];
                        arrayA[i][k - 1] = temp;
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