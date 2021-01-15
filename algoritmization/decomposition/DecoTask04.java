package by.epam.java.algoritmization.decomposition;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap;  Расстояние
 * На плоскости заданы n точек. Написать метод для определения между какими из пар точек макс расстояние
 * Координаты занести в массив
 * <p>
 * поле координат x,y = от -10 до 10 по обеим осям.
 */

public class DecoTask04 {

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

    public static int[][] arrayCreate(int n, int m) {

        int[][] arrayXY;
        arrayXY = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Random rnd = new Random();
                arrayXY[i][j] = (rnd.nextInt(21) - 10);
            }
        }
        return arrayXY;
    }

    public static void arrayPrint(int[][] arrayXY, String message) {
        for (int i = 0; i < arrayXY.length; i++) {
            for (int j = 0; j < arrayXY[i].length; j++) {
                System.out.print(arrayXY[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int combinations(int n, int m) {
        int numberOfVariables;
        numberOfVariables = getFactorial(n) / (getFactorial(m) * getFactorial(n - m));
        System.out.println(numberOfVariables);
        return numberOfVariables;
    }

    public static int[][] variables(int n, int m, int combinations) {
        int[][] variables;
        variables = new int[m][combinations];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n ; j++) {

                //variables[i][j] = i++;
               // variables[i][j] = j++;
            }
        }
        return variables;
    }

    public static double getRange(int coordX1, int coordY1, int coordX2, int coordY2) {
        double range;
        range = Math.sqrt(Math.pow(coordX1 - coordX2, 2) + Math.pow(coordY1 - coordY2, 2));
        return range;
    }

    public static double getMaxRange(int a) {
        double maxRange;
        maxRange = 0;
        return maxRange;
    }

    public static void main(String[] args) {

        int n;
        n = consoleRetrieves("Введите число n");
        int m;
        m = 2; //с-ма координат (Х и Y).
        int[][] coords = arrayCreate(n, m);
        arrayPrint(coords, "\n\tВаш набор координат\n");
        int numberOfCombinations;
        numberOfCombinations = combinations(n, m);
        int[][] variablesOfCombinations;
        variablesOfCombinations = variables(n, m, numberOfCombinations);
        arrayPrint(variablesOfCombinations, "\n\tВариации");
    }
}
