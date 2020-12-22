package by.epam.java.basics.cycle;

import java.util.Scanner;

/**
 * @author potap; Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class CyTask02 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double a, b, h, y;
		System.out.println("Введите A, B, h");
		a = in.nextDouble();
		b = in.nextDouble();
		h = in.nextDouble();

		System.out.println(" x  | f(x) ");

		while (a <= b) {
			if (a > 2) {
				y = a;
				System.out.println(a + " | " + y);
			} else {
				y = -a;
				System.out.println(a + " | " + y);
			}
			a = a + h;
		}

	}

}
