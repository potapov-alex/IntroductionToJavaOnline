package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author potap;  НОД и НОК
 * написать метод для нахождения НОД и НОК двух чисел
 */

public class DecoTask01 {

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

    public static int nod(int a, int b) {

        ArrayList ListDivA;
        ListDivA = new ArrayList();

        ArrayList ListDivB;
        ListDivB = new ArrayList();

        int div;
        div = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                ListDivA.add(i);
            }
        }

        for (int j = 1; j < b; j++) {
            if (b % j == 0) {
                ListDivB.add(j);
            }
        }

        for (int i = 0; i < ListDivA.size(); i++) {
            for (int j = 0; j < ListDivB.size(); j++) {

                if (ListDivA.get(i) == ListDivB.get(j)) {
                    div = (int) ListDivA.get(i);

                }
            }
        }
        return div;
    }

    public static int nok(int a, int b, int nodAB) {
        int nokAB;
        nokAB = a * b / nodAB;
        return nokAB;
    }

    public static void main(String[] args) {
        int numberOne;
        numberOne = consoleRetrieves("Введите первое число");
        int numberTwo;
        numberTwo = consoleRetrieves("Введите второе число");

        int nodAB = nod(numberOne, numberTwo);
        int nokAB = nok(numberOne, numberTwo, nodAB);

        System.out.println("\nНОК и НОД для чисел " + numberOne + " и " +numberTwo+", равны: "+nokAB+" и "+nodAB+" соответственно.");
    }
}
