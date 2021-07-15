package by.academy.lesson5.packages;

import by.academy.lesson5.packages.sub1.Car;

public class PackageDemo {
	public static void main(String... args) {
		Car car1 = new Car();
		car1.run();

		by.academy.lesson5.packages.sub2.Car car2 = new by.academy.lesson5.packages.sub2.Car();
		car2.run();

	}
}
