package by.academy.lesson3;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String... args) {
		int[] arr = createArray();
		System.out.println("Перед сортировкой: ");
		printArray(arr);
		sort(arr);
		System.out.println("После сортировки: ");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Введите " + i + " элемент массива: ");
			arr[i] = sc.nextInt();
		}

		sc.close();
		return arr;
	}

	public static void sort(int[] arr) {
		/*
		 * По очереди будем просматривать все подмножества элементов массива (0 -
		 * последний, 1-последний, 2-последний,...)
		 */
		for (int i = 0; i < arr.length; i++) {
			/*
			 * Предполагаем, что первый элемент (в каждом подмножестве элементов) является
			 * минимальным
			 */
			int min = arr[i];
			int min_i = i;
			/*
			 * В оставшейся части подмножества ищем элемент, который меньше предположенного
			 * минимума
			 */
			for (int j = i + 1; j < arr.length; j++) {
				// Если находим, запоминаем его индекс
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			/*
			 * Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
			 */
			if (i != min_i) {
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
	}
}
