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
        for (int i = 0; i < arrayA.length; i++) {
            Random rnd = new Random();
            arrayA[i] = rnd.nextInt(10);
            System.out.print(arrayA[i] + " ");
        }
        
    }
}
