package by.epam.java.basics.cycle;

import java.util.Scanner;

/**
 * @author potap; Для каждого натурального числа в промежутке от m до n вывести
 *         все делители, кроме единицы и самого числа. m и n вводятся с
 *         клавиатуры. 
 */

public class CyTask07 {

	public static void main(String[] args) {

		int n = retriveScanner("Введите первое число");
		int m = retriveScanner("Введите второе число");

		System.out.println("Получаем числа и их делители от " + n + " до " + m);

		for (int i = n; i < m; i++) {
			int counter = 0;
			System.out.print("делители для " +i+" : " );
			for (int j = 2; j < i; j++) {
			if (i % j  == 0){
				counter++;
				System.out.print(j+" ");
					}
				}
			if (counter == 0){
				System.out.print("Делители отсутствуют");
			}
			System.out.println(".");}
	}


	public static int retriveScanner (String message) {
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