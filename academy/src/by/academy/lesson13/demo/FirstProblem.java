package by.academy.lesson13.demo;

public class FirstProblem {

	public static void main(String... args) {

	}

	private int getExpensiveCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getCost() > 20000) {
				result++;
			}
		}
		return result;
	}

	private int getCompactCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getType().equals(CarTypes.COMPACT)) {
				result++;
			}
		}
		return result;
	}
}
