package by.academy.lesson8.interfaces.classwork.demo1;

public interface Codable {

	void code();

	default void writeHelloWorld() {
		System.out.println("Hello world");
	}
}
