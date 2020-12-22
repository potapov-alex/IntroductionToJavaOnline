package by.epam.java.algoritmization.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author potap; В массиве из целых чисел с кол-вом эл-тов n найти наиболее часто встречающееся число.
 * Если таких несколько - опередить наименьшее.
 * <p>
 * хардкод: длина массива 50, значение эл-тов от 0 до 25.
 * <p>
 */

public class ArTask09 {

    public static void main(String[] args) {

        int[] arrayA;
        int index;

        arrayA = new Random().ints(15, 0, 10).toArray();
        index = 0;

        System.out.println("Полученный массив " + Arrays.toString(arrayA));

        int[] counts = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arrayA.length; j++) {
                if (arrayA[i] == arrayA[j])
                    count++;
            }
            counts[i] = count;
            if (counts[i] == counts[index])
                index = arrayA[index] > arrayA[i] ? i : index;
            else
                index = count > counts[index] ? i : index;
        }

        System.out.println("Минимальный наиболее часто встречающийся эл-т -- " + arrayA[index]);

    }
}