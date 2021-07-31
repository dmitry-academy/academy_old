package by.academy.lesson9.generics;

public class AverageDemo {
	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Average<Integer> integerAverage = new Average<>(intArray);

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Average<Double> doubleAverage = new Average<>(doubleArray);

// 		Нельзя!
//		integerAverage= doubleAverage;
//		Average<int> doubleAverage = new Average<>(doubleArray);

// 		Нельзя!
//		String[] strArray = { "asd", "lalalala" };
//		Average<String> strAverage = new Average<>(strArray);

		System.out.println("Среднее значения для Integer " + integerAverage.average());
		System.out.println("Среднее значения для Double " + doubleAverage.average());

		// Не откомпилируется,
		// потому что String не является наследником Number
//		String[] strArray = { "1", "2", "3", "4", "5" };
//		Average<String> strAverage = new Average<>(strArray);
//
//		System.out.println("Среднее значения для String " + strAverage.average());
	}
}