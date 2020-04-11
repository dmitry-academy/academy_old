package by.academy.lesson3;

public class DoWhileLoop {

	public static void main(String... args) {
//		int counter = 10;
//		do {
//			// код
//			// также называемый "телом цикла"
//			System.out.println("Осталось " + counter + " сек.");
//			counter--;
//		} while (counter > 10);

		int sum = 0;
		int i = 0;
		while (i < 20) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("sum = " + sum);

	}
}
