package by.academy.impl;

public interface Movable {

	void move();

	default void beforeMove() {
		System.out.println("Before move");
	}
}
