package by.epam.java.basics.branch;

/**
 * @author potap; find max(min(a,b),min(c,d))
 */

public class BrTask02 {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		int x = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("max of (min(a,b) & min(c,d)" +x);
	}
}