package by.academy.lesson3;

import java.util.Scanner;

public class BubbleSort {

//	Example:
//		First Pass:
//		( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
//		( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
//		( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
//		( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
//
//		Second Pass:
//		( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
//		( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
//		( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//		( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
//		Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
//
//		Third Pass:
//		( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//		( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//		( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//		( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

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

	public static int[] sort(int[] arr) {

		boolean isSorted = false;
		int buf;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					isSorted = false;
					buf = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = buf;
				}
			}
		}
		return arr;
	}
}
