package by.epam.java.basics.line;

/**
 * @author potap; 5. Дано натуральное число Т, которое представляет длительность
 *         прошедшего времени в секундах. Вывести данное значение длительности в
 *         часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class LineTask05 {
	public static void main(String[] args) {

		int numberT = 123456789;

		int h = numberT / 3600;
		int m = (numberT - (h * 3600)) / 60;
		int s = (numberT - (h * 3600) - (m * 60));

		System.out.println("в часах " + h + ":" + m + ":" + s);
	}
}
