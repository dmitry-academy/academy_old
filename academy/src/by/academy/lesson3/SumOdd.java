package by.academy.lesson3;

public class SumOdd {

	public static void main(String... args) {
		int sum = 0;
		int i = 0;
		while (i < 20) {

			if (i % 2 == 0) {
				sum += i;
			}
			i++;

		}
		System.out.println(sum);

		System.out.println(0 % 2);
	}
}
