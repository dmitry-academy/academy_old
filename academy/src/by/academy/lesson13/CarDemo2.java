package by.academy.lesson13;

public class CarDemo2 {
	public static void main(String[] args) {
		Car[] cars = { new Car(CarType.COMPACT, 34000), new Car(CarType.SPORT, 44000), new Car(CarType.COMPACT, 14000),
				new Car(CarType.COMPACT, 10000), };

		CarDemo2 carDemo = new CarDemo2();
		System.out.println(carDemo.getCarsNumber(cars, new CompactCarSearch()));
		System.out.println(carDemo.getCarsNumber(cars, new ExpensiveCarSearch()));

		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getType().equals(CarType.COMPACT);
			}
		}));

		carDemo.getCarsNumber(cars, (Car car) -> car.getType().equals(CarType.COMPACT));
	}

	private int getCarsNumber(Car[] cars, Searchable s) {
		int result = 0;
		for (Car car : cars) {
			if (s.test(car)) {
				result++;
			}
		}
		return result;
	}
}