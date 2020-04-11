package by.academy.lesson4;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] array = { 5, 1, 2, 3, 4, 5, 65, 7, 657, 34, 534, 65, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.print (array[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array));

	}

}
