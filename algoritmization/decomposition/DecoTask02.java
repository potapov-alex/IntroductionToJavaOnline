package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author potap;  НОД
 * написать метод для нахождения НОД четырех натуральных чисел
 * <p>
 * Возможно создавать числа рандомом будет неуклюже. НОД часто будет равен 1.
 */

public class DecoTask02 {

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

    public static int[] arrayCreate(int length) {
        int[] array;
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = consoleRetrieves("Введите натуральное число");
        }
        return array;
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

    public static void main(String[] args) {

        int[] numbers;
        numbers = arrayCreate(4);

        int nodOfFour;
        nodOfFour = 0;

        for (int i = 1; i < numbers.length; i++) {
            nodOfFour = numbers[0];
            nodOfFour = nod(nodOfFour, numbers[i]);
        }
        System.out.println("НОД четырех чисел равен: " + nodOfFour);
    }
}