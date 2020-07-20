package by.academy.lesson7;

public class RecursionDemo {

	public static void main(String... args) {
		test(0);
	}

	public static void test(int counter) {
		if (counter >= 100) {
			System.out.println("никаких больше stack overflow");
			return;
		}

		System.out.println("Hi there!" + counter);
		test(++counter);
	}
}
