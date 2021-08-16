package by.academy.lesson5.impl;

public interface Movable {

	void move();

	default void beforeMove() {
		System.out.println("Before move");
	}
}
