package by.academy.lesson7.menu;

import java.util.Scanner;

public class MenuExample {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		String s = "";

		while (!"4".equals(s)) {
			System.out.println("1. Для создания массива из нечетных числе введите 1");
			System.out.println("2. Для создания массива из чисел Фибоначчи введите 2");
			System.out.println("3. Для создания двумерного массива введите 3");
			System.out.println("4. Для выхода из приложения введите 4");
			s = scan.next();

			try {
				x = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}

			switch (x) {
			case 1:
				// вызов метода 1
				break;
			case 2:
				// вызов метода 2
				break;
			case 3:
				// вызов метода 3
				break;
			}
		}
		System.out.println("До свидания!");
		scan.close();
	}
}
