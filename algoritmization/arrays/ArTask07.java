package by.epam.java.algoritmization.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author potap; Даны действительные числа a1, a2, ..., an.
 *         Найти max(a1 + a2n, a2 + a2n-1, ..., an+1)
 *         <p>
 *         хардкод: длина массива 10, значение эл-тов от 0 до 10.
 *
 */

public class ArTask07 {

    public static void main(String[] args) {

        int max;
        max = 0;
        int summ;
        summ = 0;
        int[] arrayA;
        arrayA = new Random().ints(10, 0, 10).toArray();

        if (arrayA.length %2 != 0) {
            System.out.println("Введенные данные не удовлетворяют условию. Массив не четный" + arrayA.length);
        } else {
            System.out.println("полученный массив"+ Arrays.toString(arrayA));
            for (int i = 0; i < arrayA.length/2; i++) {
                summ=arrayA[i]+ arrayA[arrayA.length-1-i];
                System.out.println("значение " + arrayA[i] +" + " + arrayA[arrayA.length-1-i] +" hfdyj  " + summ);

                if (max < summ) {
                    max = summ;
                }
            }
            System.out.println("искомое max = "+max);
        }
    }
}
