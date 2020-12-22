package by.epam.java.algoritmization.arrays;

/**
 * @author potap; Даны целые числа: a1...an. Вывести на печать те, для которых
 * ai>i.
 * <p>
 * хардкод: размерность массива N =10.
 * интервал случайных значений эл-тов массива от -10 до 10
 */

public class ArTask05 {

    public static void main(String[] args) {

        int[] arrayA;
        arrayA = new int[10];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 20 - 10);
            if (arrayA[i] > i) {
                System.out.println("Значение ячейки " +i+ " равно "+ arrayA[i] + ", что больше ее порядкового номера (" + i + ").");
            }
        }
        System.out.println("Массив имеет вид:");
        for (int x : arrayA) {
            System.out.print(x + " ");
        }
    }
}