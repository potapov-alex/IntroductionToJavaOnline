package by.epam.java.algoritmization.decomposition;

import java.util.Scanner;

/**
 * @author potap;
 * Составить метод вычисления площади прямоугольника, если угол при сторонах X и Y прямой.
 * <p>
 * Cтороны целочисленные.
 */

public class DecoTask09 {

    public static int x = consoleRetrieves("Введите длину стороны X");
    public static int y = consoleRetrieves("Введите длину стороны Y");
    public static int z = consoleRetrieves("Введите длину стороны Z");
    public static int t = consoleRetrieves("Введите длину стороны T");

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

    public static double squareRightTriangle(int x, int y) {
        double square;
        square = (x * y) / 2;
        return square;
    }

    public static double squareThreeSides(double h, int z, int t) {
        double p;
        p = (h + z + t) / 2;
        double square;
        square = Math.sqrt(p * (p - h) * (p - z) * (p - t));
        return square;
    }

    public static double lengthHypotenuse(int x, int y) {
        double lenght;
        lenght = Math.sqrt(Math.pow(x, 2) * Math.pow(y, 2));
        return lenght;
    }

    public static void main(String[] args) {
        double hypotenuse;
        hypotenuse = lengthHypotenuse(x,y);
        if (z + t <= hypotenuse) {
            System.out.println("\n\tВаш многоугольник не может существовать.\n Введите корректные данные.\n");
        } else {
            double srt;
            srt = squareRightTriangle(x, y);
            double sts;
            sts = squareThreeSides(hypotenuse, z, t);
            double squareOfTriangle;
            squareOfTriangle = srt + sts;
            System.out.println("Площадь Четырехугольника равна: "+squareOfTriangle);
        }
    }
}