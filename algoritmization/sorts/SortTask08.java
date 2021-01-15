package by.epam.java.algoritmization.sorts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author potap;  сортировка шелла.
 * Дан массив n действительных чисел. Упорядочить по возрастанию.
 * Если a1<a2 передвигается на один вперед, если a1>a2 то происходит перестановка назад.
 */


public class SortTask08 {


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

    public static void sortDenominator(int[] sequence) {

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

   /* public static int lcm(int[] arraySorted) {

        for (int i = 0; i < arraySorted.length; i++) {

        }

        return lcm;
    }*/

    public static void printFraction(int[] arrayN, int[] arrayD, String s) {
        System.out.println(s);
        for (int i = 0; i < arrayN.length; i++) {
            System.out.print(arrayN[i] + "/" + arrayD[i] + "\t");
        }
    }

    public static void main(String[] args) {

        int arrayLength;
        arrayLength = consoleRetrieves("введите размер массива");
        int arrayRandomStarts;
        arrayRandomStarts = consoleRetrieves("введите начало случайного диапазона");
        int arrayRandomEnds;
        arrayRandomEnds = consoleRetrieves("введите конец случайного диапазона");

        int[] arrayNumerator;
        arrayNumerator = arrayCreateRandom(arrayLength, arrayRandomStarts, arrayRandomEnds);
        int[] arrayDenominator;
        arrayDenominator = arrayCreateRandom(arrayLength, arrayRandomStarts, arrayRandomEnds);

        ArrayList listDenominator;
        listDenominator = new ArrayList();
        for (int i = 0; i < arrayDenominator.length; i++) {
            listDenominator.add(arrayDenominator[i]);
        }

        sortDenominator(arrayDenominator);


        printFraction(arrayNumerator, arrayDenominator, "\nВаши дроби до \n");

        printFraction(arrayNumerator, arrayDenominator, "\nВаши дроби после \n");


    }
}

