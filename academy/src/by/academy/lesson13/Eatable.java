package by.academy.lesson13;

import by.academy.lesson13.demo.Car;

@FunctionalInterface
public interface Eatable {
	
	void doSomething(Car car);

	default void doSomething1(Car car) {

	};

}
