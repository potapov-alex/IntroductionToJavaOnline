package by.epam.java.algoritmization.arrays;

/**
 * @author potap; Дан массив действительных чисел, размерность которого N,
 * Посчитать кол-во положительных, отриц и нулевых эл-тов.
 * <p>
 * хардкод: размерность массива N =10.
 * интервал случайных значений эл-тов массива от -10 до 10
 */

public class ArTask03 {

    public static void main(String[] args) {

        int numeric;
        numeric = 10;

        int[] arrayA;
        arrayA = new int[numeric];
        int counterZer;
        counterZer = 0;
        int counterPos;
        counterPos = 0;
        int counterNeg;
        counterNeg = 0;

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 20 - 10);

            if (arrayA[i] == 0) {
                counterZer++;
            } else if (arrayA[i] > 0) {
                counterPos++;
            } else {
                counterNeg++;
            }
        }

        System.out.println("Массив имеет вид:");
        for (int x : arrayA) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("кол-во положительных = " + counterPos + "; отрицательных = " + counterNeg
                + "; нулевых эл-тов = " + counterZer + ".");
    }
}