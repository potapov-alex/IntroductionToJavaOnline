package by.epam.java.basics.cycle;

import java.util.Scanner;

/**
 * @author potap; Напишите программу, где пользователь вводит любое целое
 *         положительное число. А программа суммирует все числа от 1 до
 *         введенного пользователем числа.
 */

public class CyTask01 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sA = new Scanner(System.in);
		System.out.println("введите число");
		int A = sA.nextInt();
		int k = 0;

		for (int i = 0; i < A; i++) {
			k = k + i;

		}
		System.out.println("сумма чисел от 1-го до " + A + " = " + k);
	}
}