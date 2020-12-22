package by.epam.java.algoritmization.sorts;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; Заданы два одномерных массива с различным кол-вом эл-тов и
 * натуральное k. объединить их в один массив. включить между k и k+1.
 * не используя доп массивов.
 */

public class SortTask01 {

    public static void main(String[] args) {

        int numberN;
        numberN = ret("введите размер первого массива");
        int numberM;
        numberM = ret("введите размер второго массива");
        int numberK;
        numberK = ret("введите значение K");

        if (numberK > numberN) {
            System.out.println("невозможно выполнить условие задачи");
        } else {

            int[] arrayA;
            arrayA = new int[numberN];
            int[] arrayB;
            arrayB = new int[numberM];

            System.out.println("массив А");
            for (int i = 0; i < arrayA.length; i++) {
                Random rnd = new Random();
                arrayA[i] = rnd.nextInt(10);
                System.out.print(arrayA[i] + " ");
            }
            System.out.println();

            System.out.println("массив Б");
            for (int i = 0; i < arrayB.length; i++) {
                Random rnd = new Random();
                arrayB[i] = rnd.nextInt(10);
                System.out.print(arrayB[i] + " ");
            }
            System.out.println("\n массив образованный с помощью arrayList");

            ArrayList arrays = new ArrayList();
            for (int i = 0; i < numberK; i++) {
                arrays.add(arrayA[i]);
            }
            for (int i = 0; i < numberM; i++) {
                arrays.add(arrayB[i]);
            }
            for (int i = numberK; i < numberN; i++) {
                arrays.add(arrayA[i]);
            }
            System.out.println("\n" + arrays);
        }
    }

    public static int ret(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int d;
        System.out.println(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(message);
        }
        d = sc.nextInt();
        return d;
    }
}