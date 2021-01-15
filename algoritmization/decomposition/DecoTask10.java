package by.epam.java.algoritmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author potap; Дано натуральное число N.
 * Составить метод составить метод формирования массива, эл-ми которого явл. цифры числа N.
 */

public class DecoTask10 {

    static int numberN = consoleRetrieves("Введите число N");

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

    public static int[] getCountDigits(int number) {
        int length = String.valueOf(number).length();
        int[] result = new int[length];
        while (number != 0) {
            result[--length] = number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = getCountDigits(numberN);
        System.out.printf("Число: %d; %sСостоит из цифр: %s;%sКол-во цифр: %d;",
                numberN, System.lineSeparator(), Arrays.toString(result), System.lineSeparator(), result.length);
    }
}