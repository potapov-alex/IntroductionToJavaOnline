package by.epam.java.algoritmization.decomposition;

import java.util.ArrayList;

/**
 * @author potap;
 * Написать метод для получения суммы факториалов нечетных чисел от 1-го до 9-ти
 * <p>
 * Считаем включительно от 1-го до 9-ти
 */

public class DecoTask07 {

    static int length = 9;
    static int factorialSumma = 0;

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList OddNumbers = new ArrayList();
        for (int i = 1; i <= length; i++) {
            if (i % 2 != 0) {
                OddNumbers.add(i);
            }
        }

        for (int i = 0; i < OddNumbers.size(); i++) {
            factorialSumma += getFactorial((Integer) OddNumbers.get(i));
        }
        System.out.println("сумма факториала от 1-го до 9-ти равна: " + factorialSumma);
    }
}