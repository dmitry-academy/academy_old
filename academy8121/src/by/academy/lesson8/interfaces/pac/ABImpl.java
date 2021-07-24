package by.academy.lesson8.interfaces.pac;

public class ABImpl implements A, B {

	@Override
	public void someMethod() {
		A.super.someMethod();
		B.super.someMethod();
	}
}
