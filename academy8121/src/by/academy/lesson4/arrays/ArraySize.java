package by.academy.lesson4.arrays;

public class ArraySize {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[][] array2 = { { 1, 1, 1 }, { 4, 3, 2, 1 } };
		System.out.println("Размер массива array1 = " + array1.length);
		System.out.println("Размер массива array2 = " + array2.length);
		System.out.println("Размер 1-строки массива array2 = " + array2[1].length);
		System.out.println(array2[1][1]);

	}
}