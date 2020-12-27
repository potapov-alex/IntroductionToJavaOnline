package by.epam.java.algoritmization.sorts;

import java.util.Scanner;

/**
 * @author potap;  сортировка вставками.
 * Дана последовательность a1, a2 ... an. Переставить числа в порядке возрастания.
 * пусть a1<=a2<=...<=an, берется следующее число ai+1, и вставляется так чтобы новая последовательность была возраст.
 * Место помещения нового эл-та производить с помощью двоичного поиска. ДП оформить с помощью отдельной функции.
 */

public class SortTask05 {

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

    static void sortSequence(int[] sequence, int sortFrom) {
        //циклом проходим от числа сразу за отсортированной частью и до конца массива
        for (int i = sortFrom; i < sequence.length; i++) {
            int numberToSearch = sequence[i];
            //вызываем метод бинарного поиска, куда передаем, последовательность, число для поиска, и верхнюю границу
            int indexToInsert = binarySearch(sequence, numberToSearch, i);
            //сдвигаем все элементы массива с индексом большим, чем идекс из бинарного поиска
            for (int j = i; j > indexToInsert; j--) {
                sequence[j] = sequence[j - 1];
            }
            sequence[indexToInsert] = numberToSearch;
        }
    }

    static int binarySearch(int[] arr, int numberToSearch, int upperBound) {
        int low = 0;
        int high = upperBound - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (numberToSearch > arr[middle]) {
                low = middle + 1;
            } else if (numberToSearch < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
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

        System.out.println("Ваша последовательность \n");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }

        sortSequence(arrayA,1);
        printArray(arrayA,"\n отсортированный диапазон \n");
    }
}
