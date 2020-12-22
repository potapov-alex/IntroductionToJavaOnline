package by.epam.java.algoritmization.multi;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author potap; Дана матрица вывести на экран все нечетные столбцы, у которых
 * первый эл-т больше последнего
 */

public class MTask01 {

    public static void main(String[] args) {


        int[][] arrayA;
        arrayA = new int[10][10];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd;
                rnd = new Random();
                arrayA[i][j] = rnd.nextInt(10);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Нечетные столбцы, у которых первый элемент больше последнего: ");

        for (int i = 1; i < arrayA[0].length; i += 2) {
            if (arrayA[0][i] > arrayA[arrayA.length - 1][i]) {
                System.out.println("Столбец номер " + (i + 1));
                for (int j = 0; j < arrayA.length; j++) {
                    System.out.print(arrayA[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}