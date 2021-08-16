package by.academy.lesson13;

import by.academy.lesson13.demo.Car;

public class ExpensiveCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getCost() > 20000;
	}

}