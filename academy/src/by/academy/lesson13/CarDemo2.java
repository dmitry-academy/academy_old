package by.academy.lesson13;

import java.io.IOException;
import java.util.function.Predicate;

import by.academy.lesson13.demo.Car;
import by.academy.lesson13.demo.CarTypes;

public class CarDemo2 {
	public static void main(String[] args) throws IOException {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.SPORT, 44000), new Car(CarTypes.COMPACT, 14000),
				new Car(CarTypes.COMPACT, 10000), };

		CarDemo2 carDemo = new CarDemo2();
		System.out.println(carDemo.getCarsNumber(cars, new CompactCarSearch()));
		System.out.println(carDemo.getCarsNumber(cars, new ExpensiveCarSearch()));

		int i = 0;
		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				System.out.println(i);
				return car.getType().equals(CarTypes.SPORT);
			}
		}));

		boolean test = cars[0].getType().equals(CarTypes.COMPACT);

		carDemo.getCarsNumber(cars, (Car car) -> {
			return car.getType().equals(CarTypes.COMPACT);
		});
	}

	private int getCarsNumber(Car[] cars, Predicate<Car> s) throws IOException {
		int result = 0;
		for (Car car : cars) {
			if (s.test(car)) {
				result++;
			}
		}
		return result;
	}
}