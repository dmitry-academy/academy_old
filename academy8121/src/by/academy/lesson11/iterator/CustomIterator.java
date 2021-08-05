package by.academy.lesson11.iterator;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

	private T[] array;
	private int index;

	public CustomIterator() {
		super();
	}

	public CustomIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || array.length <= index) {
			return false;
		}
		return array[index] != null;
	}

	@Override
	public T next() {
		return array[index++];
	}
}
