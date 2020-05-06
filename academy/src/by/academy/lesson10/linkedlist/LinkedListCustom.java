package by.academy.lesson10.linkedlist;

public class LinkedListCustom<T> {

	private Node head;

	private int size;

	public int size() {
		return size;
	}

	class Node {

		Node next;
		Node prev;
		T value;

		public Node(Node prev, Node next, T newVal) {
			this.prev = prev;
			this.next = next;
			this.value = newVal;
		}
	}

	public void add(int index, T newVal) {
		
		if(head == null) {
			head = new Node(null, null, newVal);
			return;
		}
		
		Node current = head;
		int counter = 0;
		while (current != null) {
			if (counter == index) {
				Node newNode = new Node(current.prev, current, newVal);
				Node prev = current.prev;
				prev.next = newNode;
				current.prev = newNode;
				size++;
				return;
			}
			current = current.next;
			counter++;
		}
	}

	public T remove(int index) {
		Node current = head;
		int counter = 0;
		while (current != null) {
			if (counter == index) {
				T val = current.value;
				Node prev = current.prev;
				Node next = current.next;
				prev.next = next;
				next.prev = prev;
				size--;
				return val;
			}
			current = current.next;
			counter++;
		}
		// throw exception
		return null;
	}

	public T get(int index) {
		Node current = head;
		int counter = 0;
		while (current != null) {
			if (counter == index) {
				return current.value;
			}
			current = current.next;
			counter++;
		}
		// throw exception
		return null;
	}

}
