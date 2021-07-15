package by.academy.lesson4.loops;

public class DoWhile {
	public static void main(String[] args) {

		int m = 10;
		int i = 10;

		while (m > 10) {
			System.out.println("Тест " + m--);
		}

		do {
			System.out.println("Sample : " + i--);
		} while (i > 10);

//		int sum = 0;
//		int i = 0;
//		while (i < 20) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.print("sum = " + sum);

	}
}