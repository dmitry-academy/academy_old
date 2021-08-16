package by.academy.lesson5.strings;

import java.util.Arrays;

public class SortString {
	private static String[] array = { "ааа", "авб", "абв", "АБВ" };

	public static void main(String[] args) {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].compareTo(array[j]) < 0) {
					String t = array[j];
					array[j] = array[i];
					array[i] = t;
				}
			}
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
