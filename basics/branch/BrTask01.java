package by.epam.java.basics.branch;

/**
 * @author potap; Даны два угла треугольника (в градусах). Определить,
 *         существует ли такой треугольник, и если да, то будет ли он
 *         прямоугольным.
 */

public class BrTask01 {
	public static void main(String[] args) {

		int a = 49;
		int b = 41;

		if (a + b >= 180)
			System.out.println("треугольник не может существовать");
		if (a == 90 || b == 90 || a + b == 90) {
			System.out.println("треугольник существует. явл прямоугольным");
		} else {
			System.out.println("треугольник существует. не явл прямоугольным");
		}
	}

}
