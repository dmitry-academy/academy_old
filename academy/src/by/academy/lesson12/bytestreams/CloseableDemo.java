package by.academy.lesson12.bytestreams;

import java.io.IOException;

public class CloseableDemo {
	public static void main(String... args) throws IOException {

		try (CloseableTest t = new CloseableTest()) {
			System.out.println("flag1");
		}
		System.out.println("flag2");
	}
}
