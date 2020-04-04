package by.academy.lesson3;

public class DoWhileLoop {

	public static void main(String... args) {
		int counter = 10;
		do {
			// код
			// также называемый "телом цикла"
			System.out.println("Осталось " + counter + " сек.");
			counter--;

		} while (counter > 10);

	}
}
