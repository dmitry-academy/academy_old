package by.academy.lesson7.oop.classwork;

public interface Sleepable {
	public default void defaultTest() {
		System.out.println("default test");
	}
}
