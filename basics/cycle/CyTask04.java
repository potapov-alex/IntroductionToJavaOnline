package by.epam.java.basics.cycle;

import java.math.BigInteger;

/**
 * @author potap; Составить программу нахождения произведения квадратов первых
 *         двухсот чисел.
 */

public class CyTask04 {
	public static void main(String[] args) {

		BigInteger k = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			k = k.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println(k);
	}
}
/* хз. что-то вычислилось */