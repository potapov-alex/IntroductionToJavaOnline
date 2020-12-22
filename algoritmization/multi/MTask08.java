package by.epam.java.algoritmization.multi;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; В числовой матрице поменять местами два столбца. номера
 * столбцов вводить вручную.
 */

public class MTask08 {
    public static void main(String[] args) {

        int numberM;
        numberM = consoleRetrieves("введите размер матрицы m:m");
        int numberA;
        numberA = consoleRetrieves("введите номера столбцов для замены");
        int numberB;
        numberB = consoleRetrieves("введите номера столбцов для замены");
        int temp;

        int arr[][] = new int[numberM][numberM];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Random rnd = new Random();
                arr[i][j] = rnd.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i][numberA - 1];
            arr[i][numberA - 1] = arr[i][numberB - 1];
            arr[i][numberB - 1] = temp;
        }

        System.out.println("после замены:");
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(" " + y);
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
        } while (number <= 0);
        System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
        return number;
    }
}
