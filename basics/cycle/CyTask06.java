package by.epam.java.basics.cycle;

/**
 * @author potap; Вывести на экран соответствия между символами и их численными
 *         обозначениями в памяти компьютера.
 */

public class CyTask06 {

	public static void main(String[] args) {

		char symbol;
		int range = 65535; // диапазон значений char от 0 до 65535
		for (int i = 0; i<= range; i++) {
			symbol = (char) i;
			System.out.println(i+ " = " + symbol);
		}
	}
}