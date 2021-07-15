package by.academy.lesson4;

import java.util.Random;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] values = new int[10];

		for (int i = 0; i < values.length; i++) {
			values[i] = new Random().nextInt(10);
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		for (int element : values) {
			System.out.println(element);
		}
	}

}
