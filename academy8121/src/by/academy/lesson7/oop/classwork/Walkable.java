package by.academy.lesson7.oop.classwork;

public interface Walkable {

	public void walk();

	public default void defaultTest() {
		System.out.println("default test");
	}
}
