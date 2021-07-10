package by.academy.lesson3.logic;

import java.util.Scanner;

public class BoolTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число:");
		int i = scan.nextInt();

		if (i % 2 == 0) {
			System.out.println("число четное");
		} else if (i % 2 == 1 && i > 2) {
			System.out.println("число нечетное и больше 2");
		} else {
			System.out.println("число нечетное меньше 2");
		}

		scan.close();
	}

}
