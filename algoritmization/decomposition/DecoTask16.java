package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;

/**
 * @author potap;
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class DecoTask16 {

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

    //method check odd digits in number
    public static boolean oddDigitsCheck(int[] digitsArray) {
        boolean result;
        result = true;
        int i;
        for (i = 0; i < digitsArray.length; ++i)
            if ((digitsArray[i] % 2) == 0) {
                result = false;
                break;
            }
        return result;
    }

    //method calculate even digits in number
    public static int eveDigitsCalc(int[] digitsArray) {
        int evenDigitCounter;
        evenDigitCounter = 0;
        for (int i = 0; i < digitsArray.length; ++i)
            if ((digitsArray[i] % 2) == 0) {
                evenDigitCounter++;
            }
        return evenDigitCounter;
    }

    public static void main(String[] args) {
        //take range from 1 to max int 2147483647
        int numberN;
        numberN = 2147;
        int oddSumm;
        oddSumm = 0;
        ArrayList realGrowNumber = new ArrayList();

        for (int i = 0; i < numberN; i++) {
            if (oddDigitsCheck(getCountDigits(i)) == true) {
                realGrowNumber.add(i);
                oddSumm += realGrowNumber.indexOf(i);
            }
        }

        int numberOfEvenDigits;
        numberOfEvenDigits = eveDigitsCalc(getCountDigits(oddSumm));

        System.out.println("Сумма всех нечетных цифр чисел от 1 до "+numberN+" = " + oddSumm + ". Кол-во четных в сумме = " + numberOfEvenDigits);
    }
}
