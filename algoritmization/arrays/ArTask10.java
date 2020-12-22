package by.epam.java.algoritmization.arrays;

import java.util.Scanner;

/**
 * @author potap; Дан целочисленный массив с кол-вом эл-тов n.
 * Сжать массив, выбросив из него каждый второй эл-т.
 * Освободившиеся эл-ты заполнить нулями. не создавать новый массив
 * <p>
 * хардкод: интервал случайных значений эл-тов массива 1000
 */

public class ArTask10 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("вводим кол-во эл-тов");
        int numeric = sc.nextInt();

        int[] arrayA;
        arrayA = new int[numeric];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Массив имеет вид:");
        for (int x : arrayA) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (i % 2 != 0) {
                arrayA[i] = 0;
            }
        }

        System.out.println();
        for (int x : arrayA) {
            System.out.print(x + " ");
        }
    }
}
