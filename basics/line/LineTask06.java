package by.epam.java.basics.line;

/**
 * @author potap; Для данной области составить линейную программу, которая
 *         печатает true, если точка с координатами (х, у) принадлежит
 *         закрашенной области, и false — в противном случае.
 */

public class LineTask06 {
	public static void main(String[] args) {

		double x = 1;
		double y = 1;

		if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
			System.out.println("Принадлежит");
		} else {
			System.out.println("не принадлежит");
		}

	}
}
