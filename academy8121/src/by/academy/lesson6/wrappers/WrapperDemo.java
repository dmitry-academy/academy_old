package by.academy.lesson6.wrappers;

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 3;
		test(i);
		System.out.println(test1());
		System.out.println(test2());

	}

	private static void test(Integer i) {
		System.out.println(i);
	}

	private static int test1() {
		Integer i = null;
		return i;
	}

	private static Integer test2() {
		int i = 1;
		return i;
	}
}
