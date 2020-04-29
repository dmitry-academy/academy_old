package by.academy.lesson8.wildcards;

import by.academy.lesson1.Cat;
import by.academy.lesson5.impl.Car;

public class GenericDemo {
	public static void main(String... args) {
		SimpleBox<Car> carBox = new SimpleBox<Car>();
		SimpleBox<Cat> catBox = new SimpleBox<Cat>();

		carBox.setItem(new Car("BWM", 3));
		test(carBox);
	}

	public static void test(SimpleBox<Car> b) {
		Car c = b.getItem();
		c.move();

	}
}
