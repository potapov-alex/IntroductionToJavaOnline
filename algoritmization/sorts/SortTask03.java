package by.epam.java.algoritmization.sorts;

import java.util.Random;

/**
 * @author potap; Дана последовательность a1<=a2<=...<=an.
 * Написать алгоритм сортировки выбором
 */

public class SortTask03 {
    public static void main(String[] args) {

        int[] arrayA;
        arrayA = new int[10];
        System.out.println("Исходный массив\t");
        for (int i = 0; i < arrayA.length; i++) {
            Random rnd = new Random();
            arrayA[i] = rnd.nextInt(15);
            System.out.print(arrayA[i] + "\t");
        }

        int numericTemp;
        int numericMax;
        int counter;
        counter = 0;

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
            counter++;

            System.out.println("\n Массив после переставновки " + counter + "\t");
            for (int k = 0; k < arrayA.length; k++) {
                System.out.print(arrayA[k] + "\t");
            }
        }

        System.out.println("\n Итоговый массив ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println("\nВыполнено перестановок : "+counter);
    }
}
