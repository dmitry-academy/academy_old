package by.academy.lesson13.demo;

public class CarDemo2 {
	public String a = "1";

	public static void main(String[] args) {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.COMPACT, 14000), new Car(CarTypes.COMPACT, 10000), };

		CarDemo2 carDemo = new CarDemo2();

		Searchable compact = new CompactCarSearch();

		Searchable expensive = new ExpensiveCarSearch();

		System.out.println(carDemo.getCarsNumber(cars, compact));
		System.out.println(carDemo.getCarsNumber(cars, expensive));

		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getType().equals(CarTypes.SPORT);
			}
		}));
		carDemo.getCarsNumber(cars, (Car car) -> {
			return car.getType().equals(CarTypes.SPORT);
		});

	}

	private int getCarsNumber(Car[] cars, Searchable compactCarSearch) {
		int result = 0;

		for (Car car : cars) {
			if (compactCarSearch.test(car)) {
				result++;
			}
		}
		return result;
	}
}
