package by.academy.lesson8.generics;

public class GenRestriction<T> {
	private T ob;
	private T[] array;

	public GenRestriction(T ob, T[] array) {
		// Недопустимо!!!
		// оb = new Т();
		// this.ob = ob;
		ob = (T) new Object();
		array = (T[]) new Object[10];
		this.array = array;
	}
}
