package by.epam.java.algoritmization.decomposition;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap;
 * Составить програму, которая в массиве A[N] находит второе по велечине число.
 *
 * MaxRandom = 20;
 */

public class DecoTask05 {

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
        System.out.println("\t"+message+"\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int[] arrayBubbleSortDec(int[] array) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int n;
        n = consoleRetrieves("Введите размер массива");
        int[] arrayA;
        arrayA = arrayCreate(n);
        arrayPrint(arrayA, "Ваш массив");
        arrayBubbleSortDec(arrayA);
        arrayPrint(arrayA, "Ваш массив после соритровки");
        System.out.println("Второе по величине число: "+arrayA[1]);
    }
}
