package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author potap;
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class DecoTask15 {

    //method converts the digits of a number to an array
    public static int[] getCountDigits(int number) {
        int length = String.valueOf(number).length();
        int[] result = new int[length];
        while (number != 0) {
            result[--length] = number % 10;
            number /= 10;
        }
        return result;
    }

    //method check numbers grow
    public static boolean trueGrowingNumber(int[] digitsArray) {
        boolean result;
        result = true;
        int i;
        for (i = 1; i < digitsArray.length; ++i)
            if (digitsArray[i - 1] + 1 != digitsArray[i]) {
                result = false;
                break;
            }
        return result;
    }

    public static void main(String[] args) {
       //take range from 1 to max int 2147483647
        int numberN;
        numberN = 2_147_483_647;

        ArrayList realGrowNumber = new ArrayList();

        for (int i = 1; i < numberN; i++) {
            if (trueGrowingNumber(getCountDigits(i)) == true) {
                realGrowNumber.add(i);
            }
        }

        System.out.println("Все натуральные числа, цифры в которых образуют строго возрастающую последовательность");
        for (int i = 0; i < realGrowNumber.size(); i++) {
            System.out.print("\t" + realGrowNumber.get(i));
        }
    }
}