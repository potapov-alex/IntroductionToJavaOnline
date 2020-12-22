package by.epam.java.algoritmization.arrays;

import java.util.*;

/**
 * @author potap; Дана последовательность a1, a2, ..., an.
 * Сформировать новую последовательность выбросив из существующей члены равные = min(a1, a2, ..., an+1)
 * <p>
 * хардкод: длина массива 25, значение эл-тов от 0 до 25.
 * <p>
 */

public class ArTask08 {


    public static void main(String[] args) {

        int min;
        int[] arrayA;
        int size;
        int newSize;
        int counter;
        int index;

        min = 25;
        arrayA = new Random().ints(25, 0, 25).toArray();
        size = arrayA.length;
        counter = 0;
        index = 0;

        System.out.println("Полученный массив " + Arrays.toString(arrayA));

        for (int i : arrayA) {
            if (i <= min) {
                min = i;
            }
        }

        System.out.println("\nМинимальное значение массива равно: " + min);

        for (int i : arrayA) {
            if (min == i) {
                counter++;
            }
        }

        System.out.println("Кол-во повторений минимального значения массива: " + counter);

        newSize = size - counter;

        System.out.println("\nформируем новую последовательность через создание нового массива");

        int[] arrayB;
        arrayB = new int[newSize];
        for (int i : arrayA) {
            if (i != min) {
                arrayB[index++] = i;
            }
        }

        System.out.println("Сформированный массив без минимального значения" + Arrays.toString(arrayB));

        System.out.println("\nФормируем новую последовательность через ArrayList");

        ArrayList<Integer> arrayAList = new ArrayList<>();

        for (int i : arrayA) {
            arrayAList.add(i);
        }

        System.out.println("\nПоследовательность arrayList импортированная из массива arrayA");
        for (Integer value : arrayAList) {
            System.out.print(value + ", ");
        }

        //создаем итератор
        Iterator<Integer> arrayAIterator = arrayAList.iterator();

        while (arrayAIterator.hasNext()) {
            if (arrayAIterator.next() == min) {
                arrayAIterator.remove();
            }
        }

        System.out.println("Последовательность arrayList без минимального эл-та");
        for (Integer integer : arrayAList) {
            System.out.print(integer + ", ");
        }
    }
}