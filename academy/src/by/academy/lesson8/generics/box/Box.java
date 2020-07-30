package by.academy.lesson8.generics.box;

public class Box<T> {

	private T[] items;

	private int counter = 0;

	public Box() {
		super();
	}

	public Box(T[] items) {
		super();
		this.items = items;
		counter = items.length - 1;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	@SuppressWarnings("unchecked")
	public void addItem(T item) {
		if (items == null) {
			items = (T[]) new Object[10];
		}
		
		items[counter++] = item;
	}

	@SuppressWarnings("unchecked")
	public T getItem(int index) {
		if (items == null) {
			items = (T[]) new Object[10];
		}

		return items[index];
	}

}
