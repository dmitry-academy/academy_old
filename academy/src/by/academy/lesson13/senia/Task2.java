package by.academy.lesson13.senia;

public class Task2 {
	public static void main(String... args) {

		System.out.println("-------------");
		System.out.println(gcd(10, 24));// результат: 2
		System.out.println(gcd(12, 24));// результат: 12
		System.out.println(gcd(11, 24));// результат: 1
		System.out.println("-------------");
		System.out.println(lcm(3, 4));// результат: 12
		System.out.println(lcm(3, 9));// результат: 9
		System.out.println(lcm(5, 12));// результат: 60
	}

	private static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}
