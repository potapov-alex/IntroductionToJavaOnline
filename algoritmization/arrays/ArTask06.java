package by.epam.java.algoritmization.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author potap; Задана последовательность N вещественных чисел. Вычислить
 * сумму тех, порядковые номера которых явл простыми.
 * <p>
 * хардкод: размер массива N = 15, рандом от 0 до 15
 * для массива N=15 простыми индексами будут являться: 2, 3, 5, 7, 11, 13 .
 */
public class ArTask06 {

    public static void main(String[] args) {

        int[] arrayA;
        arrayA = new Random().ints(15, 0, 20).toArray();
        int summ;
        summ = 0;
        int counter;
        counter = 0;

        System.out.println("полученный массив" + Arrays.toString(arrayA));
        for (int i = 1; i < arrayA.length; i++) {
            if (primeNumber(i)) {
                summ += arrayA[i];
                counter++;
                System.out.println("значение простого индекса " + i + " равно " + arrayA[i]);
            }
        }
        System.out.println("Кол-во простых индексов массива равно: " + counter);
        System.out.println("Сумма простых индексов эл-тов массива: " + summ);

    }

    public static boolean primeNumber(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}