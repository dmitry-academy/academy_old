package by.academy.lesson13;

public class CompactCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getType().equals(CarType.COMPACT);
	}
}
