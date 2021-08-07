package by.academy.lesson11.classwork;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;

	public void add(T item) {

		Node<T> node = new Node<>();
		node.value = item;

		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	public void print() {
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.value + " ");
			node = node.next;
		}
		System.out.println();

	}

	public static void main(String... args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

//		list.print();

//		list.remove(3);
//		list.print();
//
//		list.remove(0);
//		list.print();

//		System.out.println(list.getHeadValue());
//		System.out.println(list.getTailValue());
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public T getTailValue() {
		if (tail != null) {
			return tail.value;
		}
		return null;
	}

	public T getHeadValue() {
		if (head != null) {
			return head.value;
		}
		return null;
	}

	public void remove(int index) {

		if (size == 1 && index == 0) {
			head = null;
			tail = null;
			size = 0;
			return;
		}

		if (index == size - 1) {
			Node<T> prev = tail.prev;
			prev.next = null;
			tail = prev;
			size--;
			return;
		}
		if (index >= 0 && index < size) {
			Node<T> node = getNode(index);

			Node<T> prev = node.prev;
			Node<T> next = node.next;

			if (index == 0) {
				head = next;
			}
			if (prev != null) {
				prev.next = next;
			}
			next.prev = prev;

			size--;
			return;
		}

		System.out.println("Index of bound");

	}

	public void set(int index, T item) {

	}

	private Node<T> getNode(int index) {
		int counter = 0;
		Node<T> node = head;
		while (node != null) {
			if (counter == index) {
				break;
			}
			node = node.next;
			counter++;
		}
		return node;
	}

	public T get(int index) {
		int counter = 0;
		Node<T> node = head;
		while (node != null) {
			if (counter == index) {
				break;
			}
			node = node.next;
			counter++;
		}
		return node.value;
	}

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}

	public Iterator<T> iterator() {
		return new InnerIterator();
	}

	class InnerIterator implements Iterator<T> {
		Node<T> current = null;

		@Override
		public boolean hasNext() {
			if (current == null) {
				return head != null;
			}
			return current.next != null;
		}

		@Override
		public T next() {
			if (current == null) {
				current = head;
			}
			T value = current.value;
			current = current.next;
			return value;
		}
	}

}
