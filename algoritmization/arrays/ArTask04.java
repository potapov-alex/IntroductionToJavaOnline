package by.epam.java.algoritmization.arrays;

/**
 * @author potap; Даны действительные числа a1...an, поменять местами наибольший
 * и наименьший эл-т.
 * <p>
 * хардкод: кол-во чисел n = 10.
 * интервал случайных значений эл-тов массива от -10 до 10
 */

public class ArTask04 {

    public static void main(String[] args) {

        int max;
        max = 0;
        int min;
        min = 0;
        int temp;
        int numeric;
        numeric = 10;
        int[] arrayA;
        arrayA = new int[numeric];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 20 - 10);

            if (arrayA[i] > arrayA[max]) {
                max = i;
            }
            if (arrayA[i] < arrayA[min]) {
                min = i;
            }
        }

        System.out.println("Массив имеет вид:");
        for (int x : arrayA) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("до замены:    " + "наибольший эл-т = " + arrayA[max] + ", ячейка " + max + "; наименьший эл-т = "
                + arrayA[min] + ", ячейка " + min + ".");

        temp = arrayA[max];
        arrayA[max] = arrayA[min];
        arrayA[min] = temp;

        System.out.println("после замены: " + "наибольший эл-т = " + arrayA[max] + ", ячейка " + max + "; наименьший эл-т = "
                + arrayA[min] + ", ячейка " + min + ".");
    }
}
