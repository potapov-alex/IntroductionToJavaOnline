package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;

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


    public static boolean trueGrowingNumber(int[] digitsArray) {
        boolean result;
        result = false;
        int i;
        for (i = 1; i < digitsArray.length; ++i)
            if (digitsArray[i - 1] + 1 == digitsArray[i]) {
                result = true;
                break;
            }
        return result;
    }

    public static void main(String[] args) {
        int numberN;
        numberN = 125;

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