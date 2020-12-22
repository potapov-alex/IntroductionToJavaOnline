package by.epam.java.algoritmization.multi;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; найти положительные элементы главной диагонали матрицы
 */

public class MTask10 {
    public static void main(String[] args) {

        int numberM;
        numberM = consoleRetrieves("введите размер матрицы");
        int[][] arrayA;
        arrayA = new int[numberM][numberM];
        int counter;
        counter = 0;

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd = new Random();
                arrayA[i][j] = (rnd.nextInt(11) - 5);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("положительные цифры по диагонали");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
            }
            if (arrayA[i][i] > 0) {
                System.out.print(arrayA[i][i] + "; ");
                counter++;
            }
            if (counter == 0) {
                System.out.println("отсутствуют");
            }
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
