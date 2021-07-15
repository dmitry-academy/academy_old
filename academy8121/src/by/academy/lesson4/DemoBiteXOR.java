package by.academy.lesson4;

public class DemoBiteXOR {
	public static void main(String... args) {
//		System.out.println(1 ^ 1);
//		System.out.println(1 ^ 2);
		int result = 0;
		int[] array = { 1, 2, 4, 7, 1, 4, 2 };
		for (int i = 0; i < array.length; i++) {
			result ^= array[i];
			System.out.println(result);
		}
		System.out.println("-------------");
		System.out.println(result);

	}
}
