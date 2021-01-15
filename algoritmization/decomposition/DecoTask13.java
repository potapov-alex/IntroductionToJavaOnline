package by.epam.java.algoritmization.decomposition;

import java.util.Scanner;

/**
 * @author potap;
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

public class DecoTask13 {
    static int numberN = consoleRetrieves("Введите число N");
    static int doubleN = numberN * 2;

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

    public static void twinNumbers(int number) {
        int[] arrayList = new int[2];
        for (int i = 0; i < arrayList.length-1; i++) {
            arrayList[i] = number;
            System.out.printf("число %d с бизнецом %d\n", arrayList[i], arrayList[i] + 2);
        }
    }

    public static void main(String[] args) {
        for (int i = numberN; i < doubleN - 1; i++) {
            twinNumbers(i);
        }
    }
}