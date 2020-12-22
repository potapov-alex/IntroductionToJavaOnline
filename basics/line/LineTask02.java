package by.epam.java.basics.line;

/**
 * @author potap; Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 */

public class LineTask02 {
	public static void main(String[] args) {

		double a = 2;
		double b = 2;
		double c = 4;
		double x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c + Math.pow(b, -2)));
		System.out.print("x = "+x);
	}

}
