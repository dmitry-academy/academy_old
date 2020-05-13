package by.academy.lesson11;

public class RecursionExample {
	public static void main(String... args) {
		int i = 0;
		test(i);
	}

	public static void test(Integer i) {
		String s = "asdasdasdad";
		if (i > 100) {
			return;
		}
		System.out.println(i++);
		test(i);

	}
}
