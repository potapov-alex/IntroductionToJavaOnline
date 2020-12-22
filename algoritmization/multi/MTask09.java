package by.epam.java.algoritmization.multi;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; задана матрица неотрицательных чисел. Посчитать сумму эл-тов в
 * каждом столбце. Определить который имеет макс сумму.
 * </P>
 * хардкод: рандом от 0 до 1 для удобства визуального счета
 */


public class MTask09 {

    public static void main(String[] args) {

        int numberM;
        numberM = consoleRetrieves("введите размер матрицы");
        int summ;
        int max;
        max = 0;
        int numberD;
        numberD = 0;

        int[][] a = new int[numberM][numberM];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random rnd = new Random();
                a[i][j] = rnd.nextInt(2);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            summ = 0;
            for (int j = 0; j < a.length; j++) {
                summ += a[j][i];
            }
            if (summ > max) {
                max = summ;
                numberD = i + 1;
            }
        }
        System.out.println("макс сумма - " + max + " в столбце  " + numberD);
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
