package by.epam.java.algoritmization.sorts;

import java.util.Random;

/**
 * @author potap; Дана последовательность a1<=a2<=...<=an.
 * Написать алгоритм сортировки выбором
 */

public class SortTask03 {
    public static void main(String[] args) {

        int[] arrayA;
        arrayA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив\t");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }

        int numericTemp;
        int numericMax;

        for (int i = 0; i < arrayA.length; i++) {
            numericTemp = i;
            numericMax = arrayA[i];

            for (int j = i + 1; j < arrayA.length; j++) {
                if (arrayA[j] > numericMax) {
                    numericTemp = j;
                    numericMax = arrayA[j];
                }
            }
            arrayA[numericTemp] = arrayA[i];
            arrayA[i] = numericMax;
        }

        System.out.println("\n Итоговый массив ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
    }
}
