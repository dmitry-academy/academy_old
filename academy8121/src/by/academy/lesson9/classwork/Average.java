package by.academy.lesson9.classwork;

import java.io.Serializable;

public class Average<T extends Number & Serializable & Comparable<T>> {

	private T[] items;

	public Average(T[] items) {
		super();
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public Double average() {
		if (items.length == 0) {
			return 0.0;
		}
		double sum = 0;

		for (T n : items) {
			sum += n.doubleValue();
		}
		return sum / items.length;
	}

	public boolean compare(Average<?> anotherAvgBox) {
		double myAvg = average();
		double anotherAvg = anotherAvgBox.average();

		return myAvg == anotherAvg;

	}

	public static void main(String... args) {

		Double[] arrayD = { 1.2, 2.3, 4.3, 7.6 };
		Average<Double> dAverage = new Average<>(arrayD);
		Average<Double> dAverage2 = new Average<>(arrayD);

		Integer[] arrayI = { 1, 2, 4, 7 };
		Average<Integer> iAverage = new Average<>(arrayI);

		System.out.println(dAverage.average());
		System.out.println(iAverage.average());

		System.out.println(dAverage.compare(dAverage2));
		System.out.println(dAverage.compare(iAverage));

	}

}
