package by.epam.java.algoritmization.decomposition;

/**
 * @author potap;
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */

public class DecoTask17 {

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

    //method calculate all digits in number
    public static int eveDigitsCalc(int[] digitsArray) {
        int summOfDigits;
        summOfDigits = 0;
        for (int i = 0; i < digitsArray.length; ++i)
            summOfDigits += digitsArray[i];
        return summOfDigits;
    }

    //method calculate number of subtractions
    public static int numberOfSubtractions(int numberN, int summDigits) {
        int subtractionsCounter;
        subtractionsCounter =0;
        while (numberN>=0){
            numberN -= summDigits;
         subtractionsCounter++;
        }
        return subtractionsCounter;
    }

    public static void main(String[] args) {
        //take range from 1 to max int 2147483647
        int numberN;
        numberN = 2147;
        int summDigitsOfNumber;
        summDigitsOfNumber =eveDigitsCalc(getCountDigits(numberN));
        System.out.println(summDigitsOfNumber);

        int subtractionCounter;
        subtractionCounter =numberOfSubtractions(numberN, summDigitsOfNumber);

        System.out.printf("Сума действий = %d", subtractionCounter);
    }
}