package by.academy.lesson4.arrays;

import java.util.Arrays;

public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] arraySource = { 1, 2, 3, 4, 5, 6 };
		int[] arrayDestination = new int[10];
		System.out.println("arraySource: " + Arrays.toString(arraySource));
		System.out.println("arrayDestination: " + Arrays.toString(arrayDestination));

		System.arraycopy(arraySource, 2, arrayDestination, 2, 2);
		System.out.println("arrayDestination after arrayCopy: " + Arrays.toString(arrayDestination));
	}
}