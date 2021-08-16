package by.academy.lesson13.demo;


public class CompactCarSearch implements Searchable {

	public boolean test(Car car) {
		return car.getType().equals(CarTypes.COMPACT);
	}
	
}