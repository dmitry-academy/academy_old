package by.academy.lesson5.interfacedemo;

public interface InterfaceA {

	int DISTANCE = 1000;

	void say();

	void sleepA();

	default void play() {
		System.out.println("play");
	}
}
