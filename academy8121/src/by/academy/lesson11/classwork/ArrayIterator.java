package by.academy.lesson11.classwork;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

	private T[] array;
	private int cursor = 0;

	public ArrayIterator(T[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || cursor >= array.length) {
			return false;
		}

		return array[cursor] != null;
	}

	@Override
	public T next() {
		return array[cursor++];
	}

}
