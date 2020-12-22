package by.epam.java.basics.branch;

/**
 * @author potap; Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить,
 *         будут ли они расположены на одной прямой.
 */

public class BrTask03 {
	public static void main(String[] args) {

		double x1 = -2;
		double y1 = 5;
		double x2 = 4;
		double y2 = 3;
		double x3 = 16;
		double y3 = -1;

		double s = (((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1)));

		if (s == 0) {
			System.out.println("точки расположены на одной прямой");
		} else {
			System.out.println("точки не расположены на одной прямой");
		}
	}
}