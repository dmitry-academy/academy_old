package by.academy.lesson8.interfaces.classwork.demo1;

public interface Thinkable {
	void think();

	default void openStackOverflow() {
		System.out.println("open stackoverflow");
	}

	default void test() {
		System.out.println("test");
	}
}
