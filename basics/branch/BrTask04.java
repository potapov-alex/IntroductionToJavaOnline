package by.epam.java.basics.branch;

import java.util.Scanner;

/**
 * @author potap; Заданы размеры А, В прямоугольного отверстия и размеры х, у, z
 *         кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class BrTask04 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double x, y, z, sizeA, sizeB;
		boolean i = false;
		System.out.println("введите размеры отверстия: sizeA и sizeB");
		sizeA = in.nextDouble();
		sizeB = in.nextDouble();
		System.out.println("Введите размеры кирпича: x, y, z");
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextDouble();

		if ((((x <= sizeA) && (y <= sizeB)) || ((y <= sizeA) && (x <= sizeB))) || (((y <= sizeA) && (z <= sizeB)) || ((z <= sizeA) && (y <= sizeB)))
				|| (((x <= sizeA) && (z <= sizeB)) || ((z <= sizeA) && (x <= sizeB))))

			i = true;

		if (i)
			System.out.println("Пройдет");
		else
			System.out.println("Враг не пройдет!");
	}
}