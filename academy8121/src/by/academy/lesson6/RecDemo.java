package by.academy.lesson6;

public class RecDemo {
	public static void main(String... args) {
		int counter = 1;
		test(counter);
	}

	private static void test(int i) {
		if (i > 3) {
			return;
		}
		test(++i);
	}
}
