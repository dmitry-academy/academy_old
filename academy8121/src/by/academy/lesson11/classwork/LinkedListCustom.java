package by.academy.lesson11.classwork;

public class LinkedListCustom<T> {

	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;

	public void add(T value) {

		Node<T> node = new Node<>(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;

	}

	public int getSize() {
		return size;
	}

	public void add(int index, T value) {

		if (size < index) {
			System.out.println("Ошибка");
			return;
		} else if (size == index) {
			add(value);
			return;
		} else {
			Node<T> node = new Node<>(value);
			Integer counter = 0;
			Node<T> current = head;
			while (counter < index) {
				current = current.next;
				counter++;
			}
			node.next = current;
			node.prev = current.prev;
			current.prev.next = node;
			current.prev = node;
		}

	}

	public T get(int index) {

		Node<T> node = head;
		int current = 0;

		while (current < index) {
			node = node.next;
			current++;
		}

		return node.value;
	}

	public void print() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	class Node<T> {

		T value;
		Node<T> next;
		Node<T> prev;

		Node(T value) {
			this.value = value;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [value=");
			builder.append(value);
			builder.append(", next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append("]");
			return builder.toString();
		}

	}

}
