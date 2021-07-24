package by.academy.lesson8.interfaces.pac;

public interface A {

	default void someMethod() {
		System.out.println("Some method A");
	}
	default void someMethod(String s) {
		System.out.println("Some method A" + s);
	}
}
