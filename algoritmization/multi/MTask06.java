package by.epam.java.algoritmization.multi;

import java.util.Scanner;

//@formatter:off
/* @author potap;  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *
 *					1     1     1    ...   1     1     1
 * 					0     1     1    ...   1     1     0
 * 					0     0     1    ...   1     0     0
 * 					.     .     .    .     .     .     .
 *					.     .     .     .    .     .     .
 *					.     .     .      .   .     .     .
 *			        0     0     1    ...   1     0     0
 *                  0     1     1    ...   1     1     0
 *                  1     1     1    ...   1     1     1
 */
//@formatter:on

public class MTask06 {

    public static void main(String[] args) {

        int numberN;
        numberN = consoleRetrieves("введите размер матрицы n (четное)");

        int[][] arrayA;
        arrayA = new int[numberN][numberN];
        for (int i = 0; i < arrayA.length / 2; i++) {
            for (int j = i; j < arrayA.length - i; j++) {
                arrayA[i][j] = 1;
            }
        }
        for (int i = arrayA.length - 1; i >= arrayA.length / 2; i--) {
            for (int j = i; j >= arrayA.length - i - 1; j--) {
                arrayA[i][j] = 1;
            }
        }

        System.out.println("матрица имеет вид: ");
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
            if (number % 2 == 0 && number > 0) {
                System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
            } else number = -1;
        } while (number <= 0);
        return number;
    }
}