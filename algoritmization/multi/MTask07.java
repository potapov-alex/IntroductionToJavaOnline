package by.epam.java.algoritmization.multi;

import java.util.Scanner;

/**
 * @author potap; сформировать квадратную матрицу порядка N по правилу:
 * A[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N);
 */

public class MTask07 {
    public static void main(String[] args) {

        int numberN;
        numberN = consoleRetrieves("размер матрицы");
        double[][] arrayA;
        arrayA = new double[numberN][numberN];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
                arrayA[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / numberN);
            }
        }
        System.out.println("Матрица имеет вид:");
        int pos = 0;
        for (double[] x : arrayA) {
            for (double y : x) {
                System.out.print(y + " ");
                if (y > 0) {
                    pos++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов = " + pos);
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
        System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
        return number;
    }
}
