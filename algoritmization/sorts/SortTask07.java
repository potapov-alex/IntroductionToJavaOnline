package by.epam.java.algoritmization.sorts;

import java.util.Scanner;

/**
 * @author potap; Пусть даны две неубывающие последовательности: a1<=...<=an b1<=...<=bm.
 * Требуется указать те места, на котор нужно вставлять эл-ты b, чтобы послед оставалась неубвающей.
 */

/*public class SortTask07 {

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

    public static int indexSort(int[] sequenceA, int[] sequenceB) {
        int magnitude;
        magnitude = 0;
        int lowerMagnitude;
        lowerMagnitude = 0;
        int upperMagnitude;
        upperMagnitude = 0;

        for (int i = 0; i < sequenceA.length; i++) {
            for (int k : sequenceB) {
                if ((k <= sequenceA[i]) && (k >= sequenceA[i + 1])) {
                    magnitude = k;
                    lowerMagnitude = sequenceA[i];
                    upperMagnitude = sequenceA[i + 1];
                }
            }
        }
        return magnitude,lowerMagnitude, upperMagnitude;

    }


    public static void main(String[] args) {

        int[] arrayA;
        arrayA = arrayCreateRandom(consoleRetrieves("Введите размер массива"), consoleRetrieves("Введите начало случайного"), consoleRetrieves("Введите конец случайного"));
        int[] arrayB;
        arrayB = arrayCreateRandom(consoleRetrieves("Введите размер массива"), consoleRetrieves("Введите начало случайного"), consoleRetrieves("Введите конец случайного"));

        indexSort(arrayA, arrayB);

        System.out.println("\n Число " + magnitude + "последовательности Б необходимо поместить между "
                + lowerMagnitude + " и " + upperMagnitude + " последовательности A." + "\n");
    }
}*/