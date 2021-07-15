package by.academy.lesson4.classwork;

import java.util.Arrays;
import java.util.Random;

public class Task17 {
//	1. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
//	Вывести массив на экран.

//	2. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. 
//	При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. 
//	Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, 
//	а можно отсортировать по убыванию каждую строку). 
//	Вывести преобразованный массив на экран.        
	public static void main(String[] args) {

		int[][] arr = new int[6][7];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sort(arr[i]);
		}

		System.out.println(Arrays.deepToString(arr));

	}

	public static int[] sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
