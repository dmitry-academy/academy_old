package by.academy.lesson9.classwork;

import by.academy.lesson5.packages.sub2.Car;

public class ApplicationNoGenericBox {

	public static void main(String[] args) {

		Box<Cat> b1 = new Box<>(new Cat());
		System.out.println(b1);

		NoGenericBox<Car> b2 = new NoGenericBox<>();
		System.out.println(b2);
	}

}
