package by.academy.lesson13;

public class ExpensiveCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getCost() > 20000;
	}

}