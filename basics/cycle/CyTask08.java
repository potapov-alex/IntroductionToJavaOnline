package by.epam.java.basics.cycle;

import java.util.Scanner;

/**
 * @author potap; Даны два числа. Определить цифры, входящие в запись как
 *         первого так и второго числа.
 */

public class CyTask08 {

	public static void main(String[] args) {

		int n = retrieveScanner("Веедите первое число");
		int m = retrieveScanner("Введите второе число");

		int quotientN;
		int quotientM;
		int numberOfNumbers;
		while (n!=0) {
			quotientN = n%10;
			n/=10;
			numberOfNumbers = m;
			while(numberOfNumbers!=0) {
				quotientM = numberOfNumbers%10;
				numberOfNumbers/=10;
				if(quotientN == quotientM) {
					System.out.println(quotientN +" входит в запись как первого так и второго числа");
					break;
				}
			}
		}
	}

	public static int retrieveScanner(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println(message +"\nВведите положительное число!");
			while (!sc.hasNextInt()) {
				System.out.println("это не число!");
				sc.next();
			}
			number = sc.nextInt();
		} while (number <= 0);
		System.out.println("Cпасибо! "+ message + ". Вы ввели: " + number);
		return number;
	}
}