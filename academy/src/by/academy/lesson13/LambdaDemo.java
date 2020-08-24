package by.academy.lesson13;

import by.academy.lesson13.demo.Car;
import by.academy.lesson13.demo.CarTypes;

public class LambdaDemo {

	public static void main(String... args) {
		Car[] cars = { new Car("BWM"), new Car("Mersedes", CarTypes.BIG) };

		getCompactCarsNumber(cars);
	}

	private static int getCompactCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getType().equals(CarTypes.COMPACT)) {
				result++;
			}
		}
		return result;
	}

	private static int getExpensiveCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getCost() > 20000) {
				result++;
			}
		}
		return result;
	}
}
