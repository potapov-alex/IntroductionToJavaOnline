package by.epam.java.algoritmization.multi;

import java.util.Scanner;

// @formatter:off
/* @author potap;  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *
 *					1    2     3    ...   n
 * 					n   n-1   n-2   ...   1
 * 					1    2     3    ...   n
 * 					n   n-1   n-2   ...   1
 *					.    .     .    .     .
 *					.    .     .     .    .
 *					.    .     .      .   .
 *                   n   n-1   n-2   ...   1
 */
// @formatter:on

public class MTask04 {

    public static void main(String[] args) {

        int numberN;
        numberN = consoleRetrieves("введите размер матрицы n (четное)");

        int[][] arrayA;
        arrayA = new int[numberN][numberN];

        for (int i = 0; i < arrayA.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < arrayA[i].length; j++) {
                    arrayA[i][j] = arrayA.length - j;
                }
            } else {
                for (int j = 0; j < arrayA[i].length; j++) {
                    arrayA[i][j] = j + 1;
                }
            }

        }
        for (int[] x : arrayA) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
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
        }while ((number <= 0) && ((number % 2) == 0));

        System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
        return number;
    }
}