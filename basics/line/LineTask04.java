package by.epam.java.basics.line;
/**
 * @author potap; Дано действительное число R вида nnn.ddd (три цифровых разряда
 *         в дробной и целой частях). Поменять местами дробную и целую части
 *         числа и вывести полученное значение числа.
 */

public class LineTask04 {
	public static void main(String[] args) {

		double r = 123.456;
		double y = (r * 1000) % 1000 + (int) r / 1000.0;

		System.out.println(y);
	}
}
