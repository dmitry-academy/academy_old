package by.academy.lesson13;

import java.io.IOException;

import by.academy.lesson13.demo.Car;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car) throws IOException;

	boolean equals(Object o);

	int hashCode();

	String toString();
}
