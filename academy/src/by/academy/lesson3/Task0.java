package by.academy.lesson3;

import java.util.Random;

public class Task0 {

//	Найти в массиве те элементы,
//	 значение которых меньше среднего арифметического,
//	  взятого от всех элементов массива.

	public static void main(String... args) {

		int[] array = new int[10];
		float sum = 0;
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			sum += array[i];
		}

		for (int i : array) {
			System.out.print(i + " ");
		}
		float mediana = sum / array.length;
		System.out.println();
		System.out.println("mediana: " + mediana);
		System.out.println("Summ: " + sum);

		for (int i : array) {
			if (i < mediana) {
				System.out.print(i + " ");
			}
		}
	}

}
