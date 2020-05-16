package by.academy.lesson13;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car);

	boolean equals(Object o);

	int hashCode();

	String toString();
}
