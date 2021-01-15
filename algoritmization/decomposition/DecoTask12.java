package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author potap;
 * Даны натуральные числа N и K. Написать метод формирования массива А, эл-ми которого явл числа,
 * сумма цифр которых равна К и корорые не больше N.
 * <p>
 * random K от 100 до 1000; N от 10 до 50..
 */

public class DecoTask12 {
    public static int sumOfDigits(int number) {
        int k = number;
        int x = number;
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        int numberN = rnd.nextInt(1000 - 100);
        int numberK = rnd.nextInt(50 - 10);
        System.out.printf("\n\t Система сгенерировала числа N = %d и K = %d", numberN, numberK);

        ArrayList arrayA = new ArrayList();
        for (int i = 0; i < numberN; i++) {
            int summa = sumOfDigits(i);
            if (summa == numberK) {
                arrayA.add(i);
            }
        }

        if (arrayA.isEmpty()) {
            System.out.println("\n\tОтсутствуют числа удовлетворяющие условию\n\t");
        } else {
            System.out.println("\n\tЭлемены массива А:\t\n");
            for (int i = 0; i < arrayA.size(); i++) {
                System.out.print("\t" + arrayA.get(i));
            }
        }
    }
}