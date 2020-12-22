package by.epam.java.algoritmization.multi;

import java.util.Scanner;

//@formatter:off
/* @author potap;  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
* 		
*					1     1     1    ...   1     1     1
* 					2     2     2    ...   2     2     0
* 					3     3     3    ...   3     0     0
* 					.     .     .    .     .     .     .
*					.     .     .     .    .     .     .
*					.     .     .      .   .     .     .
*			       n-1   n-1    0    ...   0     0     0 
*                   n     0     0    ...   0     0     0
*/
//@formatter:on

public class MTask05 {
	public static void main(String[] args) {

		int n = ret("введите размер матрицы n (четное)");

		int a[][] = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				a[i][j] = i + 1;
			}
		}
		System.out.println("матрица: ");
		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	private static int ret(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println("введите корректное число");
		}
		int d = sc.nextInt();
		if (d % 2 != 0) {
			System.out.println("введите четное число");
			sc.hasNext();
		}
		return d;
	}
}
