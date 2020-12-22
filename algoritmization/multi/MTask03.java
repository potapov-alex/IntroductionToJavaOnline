package by.epam.java.algoritmization.multi;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; дана матрица. вывести k-строку и p-й столбец
 */

public class MTask03 {

    public static void main(String[] args) {

        int numberM;
        numberM = consoleRetrieves("введите кол-во строк");
        int numberN;
        numberN = consoleRetrieves("введите кол-во столбцов");
        int numberK;
        numberK = consoleRetrieves("введите номер строки");
        int numberP;
        numberP = consoleRetrieves("ведите номер столбца");

        int[][] arrayA;
        arrayA = new int[numberM][numberN];

        if (numberK > numberM) {
            System.out.println("Запрошенная строка " + numberK + ", больше длины массива " + numberM);
        } else if (numberP > numberN) {
            System.out.println("Запрошенный столбец " + numberP + ", больше ширины массива " + numberN);
        } else {


            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayA[i].length; j++) {
                    Random rnd;
                    rnd = new Random();
                    arrayA[i][j] = rnd.nextInt(10);
                    System.out.print(arrayA[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Данные из " + numberK + "-й строки: ");
            for (int i = numberK - 1; i == numberK - 1; i++) {
                for (int j = 0; j < numberN; j++) {
                    System.out.print(arrayA[i][j] + "\t");
                }
            }

            System.out.print("\n Данные из " + numberP + "-го столбца: ");
            for (int i = 0; i < arrayA.length; i++) {
                for (int j = numberP - 1; j == numberP - 1; j++) {
                    System.out.print(arrayA[i][j] + "\t");
                }
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
        System.out.println("Cпасибо! " + message + ". Вы ввели: " + number);
        return number;
    }
}