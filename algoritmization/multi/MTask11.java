package by.epam.java.algoritmization.multi;

import java.util.Random;

/**
 * @author potap; Матрицу 10 на 20. заполнить числами от 0 до 15. Вывести на
 * экран матрицу и номера строк в которых число 5 втречаетсся три и
 * более раз.
 */

public class MTask11 {
    public static void main(String[] args) {

        int counter;
        counter = 0;
        int[][] arrayA;
        arrayA = new int[10][20];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                Random rnd = new Random();
                arrayA[i][j] = rnd.nextInt(16);
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("строки в которых число '5' встречается более трех раз ");
        for (int i = 0; i < arrayA.length; i++) {
            int countOfFive = 0;
            for (int j = 0; j < arrayA[i].length; j++) {
                if (arrayA[i][j] == 5) {
                    countOfFive++;
                }
            }
            if (countOfFive >= 3) {
                counter++;
                System.out.println("\n строка № "+(i+1)+": ");
                for (int k = 0; k < arrayA[i].length; k++) {
                    System.out.print(arrayA[i][k] + " ");
                }
                System.out.println();
            }
        }
        if (counter == 0) {
            System.out.println("не найдены");
        }
    }
}