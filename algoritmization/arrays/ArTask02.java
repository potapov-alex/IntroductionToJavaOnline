package by.epam.java.algoritmization.arrays;

import java.util.Scanner;

/**
 * @author potap; Дана последовательность действительных чисел а1, а1 ... an,
 *         заменить все члены больше данного Z этим числом. Посчитать кол-во
 *         замен.
 */

public class ArTask02 {

	public static void main(String[] args) {

		int arrLength = eConsole("длина массива N");
		int numberZ = eConsole("число numberZ");

		int counter = 0;

		int array[];
		array = new int[arrLength];

		for (int i = 0; i < arrLength; i++) {

			array[i] = i;
			if (array[i] > numberZ) {
				array[i] = numberZ;
				counter++;
			}
		}

		if (counter == 0) {
			System.out.println("нет эл-тов больше данного " + numberZ);
		} else {
			System.out.println("произведено замен = " + counter);
		}
	}

	public static int eConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int d;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return d = sc.nextInt();
	}
}
