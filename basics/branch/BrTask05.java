package by.epam.java.basics.branch;

import java.util.Scanner;

/**
 * @author potap; Вычислить значение функции:
 */

public class BrTask05 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sX = new Scanner(System.in);
		System.out.println("Введите X");
		double X = sX.nextDouble();
		double f;

		if (X <= 3) {
			f = Math.pow(X, 2) - 3 * X + 9;

		} else {
			f = 1 / (Math.pow(X, 3) + 6);
		}
		System.out.println("f(x) = " + f);
	}
}
