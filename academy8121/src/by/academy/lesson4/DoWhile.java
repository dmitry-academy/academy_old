package by.academy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class DoWhile {
	public static void main(String... args) {
		int[] array = new int[100];

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int sign = rand.nextInt(2);
			array[i] = rand.nextInt(10);
			if (sign == 0) {
				array[i] = -array[i];
			}

		}
		Arrays.sort(array);
		System.out.println("initial array:");
		System.out.println(Arrays.toString(array));

	}
}
