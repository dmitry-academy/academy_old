package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task4 {
	public static void main(String... strings) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество чисел для проверки:");
		int n = scan.nextInt();

		int numberOfNegative = 0;
		int numberOfPositive = 0;
		int numberOfZiro = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Введите число для проверки: ");
			int number = scan.nextInt();

			if (number < 0) {
				numberOfNegative++;
			} else if (number > 0) {
				numberOfPositive++;
			} else {
				numberOfZiro++;
			}
		}

		System.out.println("Количество позитивных: " + numberOfPositive);
		System.out.println("Количество отрицательных: " + numberOfNegative);
		System.out.println("Количество нулей: " + numberOfZiro);

		scan.close();
	}
}
