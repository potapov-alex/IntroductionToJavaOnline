package by.epam.java.algoritmization.sorts;

import java.util.Scanner;

/**
 * @author potap;  сортировка шелла.
 * Дан массив n действительных чисел. Упорядочить по возрастанию.
 * Если a1<a2 передвигается на один вперед, если a1>a2 то происходит перестановка назад.
 */

public class SortTask06 {

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

    public static int[] arrayCreateRandom(int arraySize, int randomStarts, int randomEnds) {
        int[] array;
        array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (randomEnds - randomStarts)) + randomStarts);
        }
        return array;
    }

    static void sortArrayA(int[] sequence) {

        int h = 1;
        int n = sequence.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < sequence.length; i++) {
                for (int j = i; j >= h && sequence[j] < sequence[j - h]; j -= h) {
                    int temp = sequence[j];
                    sequence[j] = sequence[j - h];
                    sequence[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }

    static void printArray(int[] array, String s) {
        System.out.println(s);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int[] arrayA;
        arrayA = arrayCreateRandom(consoleRetrieves("введите размер массива"), consoleRetrieves("введите начало случайного диапазона"), consoleRetrieves("введите конец случайного диапазона"));

        printArray(arrayA, "\n Ваш массив\n");
        sortArrayA(arrayA);
        printArray(arrayA, "\nОтсортированный массив\n");

    }
}