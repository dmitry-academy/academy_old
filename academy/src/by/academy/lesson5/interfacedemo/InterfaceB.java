package by.academy.lesson5.interfacedemo;

public interface InterfaceB {

	void say();

	default void play() {
		System.out.println("play");
	}

	void sleepB();

}
