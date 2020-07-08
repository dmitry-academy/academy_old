package by.academy.lesson3;

import java.util.Random;

public class InfinityLoop {

	public static void main(String... args) {
//		for (;;) {
//			System.out.println("Infinity loop!");
//		}
		Random rand = new Random();
		test(6);
	}

	public static void test(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i == 5) {
				System.out.println("Hooray!");
				break;
			}
		}
		System.out.println("alalalao");
	}

}
