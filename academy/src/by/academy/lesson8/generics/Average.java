package by.academy.lesson8.generics;

public class Average<T extends Number> {

	private T[] array;

	public Average(T[] array) {
		this.array = array;
	}

	public double average() {
		double sum = 0.0;

		for (T value : array) {
			sum += value.doubleValue();
		}

		return sum / array.length;
	}

	public boolean compareAverage(Average<? extends Number> obj) {
		return obj.average() == this.average();
	}
}
