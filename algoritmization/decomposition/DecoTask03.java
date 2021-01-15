package by.epam.java.algoritmization.decomposition;

import java.util.Scanner;

/**
 * @author potap;  Площадь
 * Вычислить S (площадь) правильного шестиугольника со стороной a, используя метод вычисления S треугольника
 */

public class DecoTask03 {

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

    public static double equilateralTriangle(int a) {
        double sqEqTr;
        sqEqTr = Math.pow(a, 2) * Math.sqrt(3) / 4;
        return sqEqTr;
    }

    public static void main(String[] args) {

        int a;
        a = consoleRetrieves("Введите размер стороны шестиугольника");

        double squareTriangle;
        squareTriangle = equilateralTriangle(a);
        double squaresHex;
        squaresHex = 6 * squareTriangle;

        System.out.println("Площадь правильного шестиугольника со стороной " + a + " равна: " + squaresHex + " удава");
    }
}