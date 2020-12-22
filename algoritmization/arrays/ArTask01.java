package by.epam.java.algoritmization.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; В массив A[N] занесены натуральные числа. Найти сумму тех
 *         эл-тов, которые кратны данному K.
 */

public class ArTask01 {

	public static void main(String[] args) {

		int n = eConsole("длина массива n");
		int k = eConsole("кратное k");

		int counter = 0;

		int arrayA[];
		arrayA = new int[n];

		for (int i = 0; i < arrayA.length; i++) {
			Random rnd = new Random();
			arrayA[i] = rnd.nextInt(16);
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {

			if (arrayA[i] % k == 0) {
				counter++;
			}
		}

		if (counter == 0) {
			System.out.println("кратные эл-ты отсутствуют");
		} else {
			System.out.println("сумма кратных эл-тов = " + counter);
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
