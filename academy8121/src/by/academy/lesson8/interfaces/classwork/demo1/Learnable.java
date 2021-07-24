package by.academy.lesson8.interfaces.classwork.demo1;

public interface Learnable {

	void learn();

	default void readTheBook() {
		System.out.println("Read book");
	}
}
