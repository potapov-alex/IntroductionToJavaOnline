package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author potap;
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

public class DecoTask14 {

    //method take a real number from console
    public static int consoleRetrieves(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println(message + "\nВведите положительное число!");
            while (!sc.hasNextInt()) {
                System.out.println("это не число!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
        return number;
    }

    //method converts the digit of the number to index
    public static int numberOfDigits(int number) {
        int digitOfNumber;
        digitOfNumber = (int) Math.log10(number) + 1;
        return digitOfNumber;
    }

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

    //method returns the Armstrong number
    public static int armstrongNumber(int numberOfDigits, int[] countDigits) {
        int sumOfDegrees;
        sumOfDegrees = 0;

        for (int i = 0; i < countDigits.length; i++) {
            sumOfDegrees += Math.pow(countDigits[i], numberOfDigits);
        }
        return sumOfDegrees;
    }

    public static void main(String[] args) {

        int numberK;
        numberK = consoleRetrieves("Введите диапазон K");

        ArrayList armstrongArray = new ArrayList();

        for (int i = 1; i < numberK; i++) {
            int digitsOfI = numberOfDigits(i);
            int[] countOfI = getCountDigits(i);
            int armstrongOfI = armstrongNumber(digitsOfI, countOfI);

            if (i == armstrongOfI) {
                armstrongArray.add(i);
            }
        }
        if (armstrongArray.isEmpty()) {
            System.out.printf("В диапазоне от 1 до %d числа Армстронга не найдены.", numberK);
        } else {
            System.out.printf("\n\tЧисла Армстронга от 1 до %d \n", numberK);
            for (int i = 0; i < armstrongArray.size(); i++) {
                System.out.print("\t" + armstrongArray.get(i));
            }
        }
    }
}