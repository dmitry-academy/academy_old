package by.academy.lesson4;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String... args) {
		int[] arr = createArrayRandom();
		System.out.println("Перед cортировкой: ");
		printArray(arr);
		sort(arr);
		System.out.println("Поcле cортировки: ");
		printArray(arr);
	}

	private static void sort(int[] arr) {
//		[1,6,2,6,8,4,3]
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			// -i после каждого прохода по циклу мы уверены, что 1 число на своем месте
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					printArray(arr);
				}
			}
		}

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] createArrayRandom() {
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}

	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер маccива: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Введите " + i + " Элемент массива: ");
			arr[i] = sc.nextInt();
		}

		sc.close();
		return arr;
	}

}
