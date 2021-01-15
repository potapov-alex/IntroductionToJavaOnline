package by.epam.java.algoritmization.decomposition;

import java.util.Random;

/**
 * @author potap;
 * Написать метод проверки, явл ли три числа взаимно простыми.
 * <p>
 * MaxRandom = 200 (кажется так повышается шанс получения случайного простого числа);
 */

public class DecoTask06 {

    static int length = 3;
    static int counter = 0;
    static boolean result = true;

    public static int[] arrayCreate(int length) {
        int[] array;
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(200);
        }
        return array;
    }

    public static void arrayPrint(int[] array, String message) {
        System.out.println("\t" + message + "\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    public static void isNumberIsSimple(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;
            }
        }
        counter++;
    }


    public static void main(String[] args) {

        int[] arrayOfThree;
        arrayOfThree = arrayCreate(length);
        arrayPrint(arrayOfThree, "ваш масссив");

        for (int i = 0; i < arrayOfThree.length; i++) {
            isNumberIsSimple(arrayOfThree[i]);
        } if (counter == 3) {
            System.out.println("Ваши числа являются взаимно простыми");
        } else {
            System.out.println("Ваши числа не являются взаимно простыми");
        }
    }
}
