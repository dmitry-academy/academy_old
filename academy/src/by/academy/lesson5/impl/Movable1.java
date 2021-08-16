package by.academy.lesson5.impl;

public interface Movable1 {
	
	final static int DISTANCE = 1000;

	void move();

	default void beforeMove() {
		System.out.println("Before move");
	}
}
