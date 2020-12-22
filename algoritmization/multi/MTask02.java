package by.epam.java.algoritmization.multi;

import java.util.Random;


/**
 * @author potap; Дана квадратная матрица. Вывести элементы стоящие по
 * диагонали.
 */

public class MTask02 {
    public static void main(String[] args) {

        int numberN;
        numberN = 10;

        int[][] arrayA;
        arrayA = new int[numberN][numberN];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd;
                rnd = new Random();
                arrayA[i][j] = rnd.nextInt(10);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Эл-ты по диагонали:");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i][i] + "; ");
        }
    }
}