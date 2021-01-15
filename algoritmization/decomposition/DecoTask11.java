package by.epam.java.algoritmization.decomposition;

import java.util.Scanner;

/**
 * @author potap;
 * Написать метод для определения в котором из двух чисел больше цифр.
 */

public class DecoTask11 {
    static int numberN = consoleRetrieves("Введите первое число");
    static int numberM = consoleRetrieves("Введите второе число");

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

    public static int numberOfDigits(int number) {
        int digitOfNumber;
        digitOfNumber = (int) Math.log10(number) + 1;
        return digitOfNumber;
    }

    public static void lengthComparison(int numberN, int numberM, int lengthN, int lengthM) {
        int lengthDifference;
        lengthDifference = Math.abs(lengthN - lengthM);
        if (numberM > numberN) {
            System.out.printf("\n\tВ числе %d цифр больше чем в числе %d на %d", numberM, numberN, lengthDifference);
        } else if (numberN > numberM) {
            System.out.printf("\n\tВ числе %d цифр больше чем в числе %d на %d", numberN, numberM, lengthDifference);
        } else if (numberN == numberM) {
            System.out.printf("\n\tВ числах %d и %d цифр одинковое кол-во - %d ", numberM, numberN, lengthN);
        }
    }

    public static void main(String[] args) {
        int lengthOfNumberN;
        int lengthOfNumberM;

        lengthOfNumberN = numberOfDigits(numberN);
        lengthOfNumberM = numberOfDigits(numberM);

        lengthComparison(numberN, numberM, lengthOfNumberN, lengthOfNumberM);
    }
}