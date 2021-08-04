package by.academy.lesson10.innerclasses;

public class Town4 {

	static Street s = new Street();

	public static class Street {
		public void go() {
			System.out.println("Go to the Street.");
		}
	}

	public static void main(String[] args) {
		// просто внутренние классы
		Town town = new Town();
		Town.Street street1 = town.new Street();

		// вложенные классы
		Town4.Street street = new Town4.Street();
		street.go();
	}
}
