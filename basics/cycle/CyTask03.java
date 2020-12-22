package by.epam.java.basics.cycle;

/**
 * @author potap; Найти сумму квадратов первых ста чисел.
 */

public class CyTask03 {
	public static void main(String[] args) {

		double i = 1, k;

		for (k = 0; i < 100; i++) {
			k = k + Math.pow(i, 2);
		}
		System.out.println("Сумма квадратов первых ста чисел = " + k);
	}
}
