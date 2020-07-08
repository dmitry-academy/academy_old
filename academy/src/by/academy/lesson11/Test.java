package by.academy.lesson11;

public class Test {
	public static void main(String[] args) {
		System.out.println(test(0));
	}

	public static int test(int a) {

		try {
			if (a == 0) {
				throw new IllegalArgumentException();
			}
			return 2;
		} finally {
			return 1;
		}
	}
}
