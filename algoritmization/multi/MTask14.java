package by.epam.java.algoritmization.multi;

import java.util.Scanner;

/**
 * @author potap; сформировать случайную матрицу m x n, состоящую из нулей и
 * едениц, так чтобы кол-во единиц было рaвно номеру столбца.
 */

public class MTask14 {

    public static void main(String[] args) {

        int numberM;
        numberM = consoleRetrieves("введите кол-во строк");
        int numberN;
        numberN = consoleRetrieves("введите кол-во столбцов");

        if (numberM < numberN) {
            System.out.println("невозможно выполнить условие задачи: кол-во строк меньше кол-ва стлобцов");

        } else {
            int[][] arrayA = new int[numberM][numberN];

            for (int i = 0; i < arrayA.length; i++) {
                for (int j = i; j < arrayA[i].length; j++) {
                    arrayA[i][j] = 1;
                }
            }

            System.out.println("Массив имеет вид:");
            for (int[] x : arrayA) {
                for (int y : x) {
                    System.out.printf(" " + y);
                }
                System.out.println();
            }
        }
    }

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
        return number;
    }
}
