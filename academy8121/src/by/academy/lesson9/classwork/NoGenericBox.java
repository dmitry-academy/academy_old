package by.academy.lesson9.classwork;

public class NoGenericBox<T> {

	private T[] array;

	@SuppressWarnings("unchecked")
	public NoGenericBox() {
		super();
		this.array = (T[]) new Object[4];
	}

	@SuppressWarnings("unchecked")
	public NoGenericBox(int capacity) {
		super();
		this.array = (T[]) new Object[capacity];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public void putItem(T c) {
		System.out.println("polojili item");
	}

	public T takeItem() {
		System.out.println("dostali item");
		return null;
	}
}
