package by.epam.java.algoritmization.decomposition;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap;
 * Составить програму, которая в массиве D вычисляет сумму трех последовательных чисел.
 * <p>
 * MaxRandom = 20;
 */

public class DecoTask08 {

    public static int n = consoleRetrieves("Введите размер массива");
    public static int k = consoleRetrieves("Введите начало диапазона вычисления");
    public static int m = k + 2;

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

    public static int[] arrayCreate(int length) {
        int[] array;
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(20);
        }
        return array;
    }

    public static void arrayPrint(int[] array, String message) {
        System.out.println("\t" + message + "\n");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println("\n");
    }

    public static int summaOfThree(int[] array, int k, int m) {
        int summa;
        summa = 0;
        for (int i = k - 1; i < m; i++) {
            summa += array[i];
        }
        return summa;
    }

    public static void main(String[] args) {
        if (k + 2 > n) {
            System.out.println("\tК сожалению, невозможно вычислить то, чего нет. \n Скорее всего, при подсчетах Вы вышли за пределы массива. \n Укажите иной диапазон.");
        } else {
            int[] arrayD;
            arrayD = arrayCreate(n);
            arrayPrint(arrayD, "Ваш массив");
            int summa;
            summa = summaOfThree(arrayD, k, m);
            System.out.println("\n\tСумма трех последовательно расположенных эл-тов = " + summa);
        }
    }
}