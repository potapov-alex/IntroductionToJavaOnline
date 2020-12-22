package by.epam.java.algoritmization.multi;

import java.util.Scanner;

/**
 * @author potap; составить магическийц квадрат порядка размером n
 */

public class MTask16 {

    public static void main(String[] args) {

        int numberN;
        numberN = consoleRetrieves("введите размер матрицы");

        int numberM;
        numberM = 1;
        int numberK;
        numberK = numberN * numberN / 2;

        int[][] arrayA; arrayA = new int[numberN][numberN];
        if (numberN % 2 == 0) {
            for (int i = 0; i < numberN; i++) {
                for (int j = 0; j < numberN; j++) {
                    arrayA[(j - i + numberK) % numberN][(i * 2 - j + numberN) % numberN] = numberM++;
                }
            }
        }

        System.out.println("ваш квадрат порядка");
        for (int i = 0; i < numberN; i++) {
            for (int j = 0; j < numberN; j++) {
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int consoleRetrieves(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println(message + "\nВведите положительное нечетное число!");
            while (!sc.hasNextInt()) {
                System.out.println("это не число!");
                sc.next();
            }
            number = sc.nextInt();
            if (number % 2 != 0 && number > 0) {
                System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
            } else number = -1;
        } while (number <= 0);
        return number;
    }
}