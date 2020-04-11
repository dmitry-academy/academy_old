package by.academy.lesson3.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String... args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		System.out.println("initial array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
		Arrays.sort(array);
		System.out.println();
		System.out.println("Sorted array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] += 10;
		}
		System.out.println("new array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
		System.out.println();

		for (int temp : array) {
			System.out.print(temp + "   ");
		}

	}
}
