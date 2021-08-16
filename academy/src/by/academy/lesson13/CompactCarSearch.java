package by.academy.lesson13;

import by.academy.lesson13.demo.Car;
import by.academy.lesson13.demo.CarTypes;

public class CompactCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getType().equals(CarTypes.COMPACT);
	}
}
