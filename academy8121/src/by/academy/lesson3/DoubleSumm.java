package by.academy.lesson3;

public class DoubleSumm {
	public static void main(String... args) {

		double a = 0;
		for (int i = 0; i < 10; i++) {
			a += 0.1;
			System.out.println(a);

		}
		System.out.println("Result:");
		System.out.println(a);

		int age = a > 3 ? 1 : a > 2 ? 2 : a > 1 ? 3 : 5;

		System.out.println(age);
	}
}
