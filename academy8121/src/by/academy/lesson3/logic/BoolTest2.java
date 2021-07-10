package by.academy.lesson3.logic;

import java.util.Scanner;

public class BoolTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число:");
		int i = scan.nextInt();

		if (i % 2 == 0) {
			System.out.println("Число четное");
		}

		scan.close();
	}

}
