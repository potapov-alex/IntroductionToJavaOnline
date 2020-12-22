package by.epam.java.basics.line;

/**
 * @author potap; Вычислить значение выражения по формуле (все переменные
 *         принимают действительные значения)
 */

public class LineTask03 {
	public static void main(String[] args) {

		double x = 30;
		double y = 45;

		double a = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.println("значение выражения = " + a);
	}

}
