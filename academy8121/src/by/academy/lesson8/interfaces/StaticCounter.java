package by.academy.lesson8.interfaces;

public class StaticCounter {
	public static int counter = 0;

	static {
		counter++;
	}

	public StaticCounter() {
		super();
	}
}
