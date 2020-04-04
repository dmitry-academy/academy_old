package by.academy.lesson3;

public class MathOperations {
	// 1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.
	public static void main(String... args) {
		long startTime = System.currentTimeMillis();
		System.out.println();
		System.currentTimeMillis();
		for (int j = 1; j <= 10000; j++) {
			for (int i = 1; i <= 10000; i++) {
				System.out.println(i * i);
			}
		}

		System.out.println(System.currentTimeMillis() - startTime);
	}

}
