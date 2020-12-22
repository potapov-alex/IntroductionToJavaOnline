package by.epam.java.basics.cycle;

import java.util.Scanner;

/**
 * @author potap; Даны числовой ряд и некоторое число е. Найти сумму тех членов
 *         ряда, модуль которых больше или равен заданному е.
 */

public class CyTask05 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Веедите длину числового ряда");
		int n = sc.nextInt();
		System.out.println("введите Е");
		int e = sc.nextInt();
		double summ = 0;

		double a[] = new double[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = ((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));

			if (Math.abs(a[i]) >= e) {
				summ += a[i];
			}
		}
		System.out.println("Массив имеет вид:");
		for (double x : a) {
			System.out.print(x + "; ");
		}
		System.out.println("сумма ="+ summ);
	}
}