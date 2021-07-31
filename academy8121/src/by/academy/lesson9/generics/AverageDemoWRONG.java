package by.academy.lesson9.generics;

public class AverageDemoWRONG {
	public static void main(String... strings) {
		Integer intArray[] = { 1, 2, 3, 4, 5 };
		Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Average<Integer> iob = new Average<>(intArray);
		Average<Double> dob = new Average<>(doubleArray);

		if (iob.sameAvg(dob)) {
			System.out.println("are the same.");
		} else {
			System.out.println("differ.");
		}

	}
}
