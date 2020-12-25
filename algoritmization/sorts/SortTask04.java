package by.epam.java.algoritmization.sorts;

/**
 * @author potap; Дана последовательность a1<=a2<=...<=an.
 * Переставить числа в порядке возрастания: сравнить i и i+1, посчитать перестановки.
 */

public class SortTask04 {
    public static void main(String[] args) {

        int numericTemp;
        int counter;
        counter = 0;

        int[] arrayA;
        arrayA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arrayA.length-1; i++) {
            if (arrayA[i] > arrayA[i + 1]) {
                numericTemp = arrayA[i];
                arrayA[i] = arrayA[i + 1];
                arrayA[i + 1] = numericTemp;
                counter++;
            }
        }

        System.out.println("\n Итоговый массив : " );
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println("\nВыполнено перестановок: "+counter);
    }
}
