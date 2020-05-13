package by.academy.lesson12;

import java.util.Iterator;
import java.util.Random;

public class LinkedListNode implements Iterable {

	LinkedListNode next = null;
	Integer data = null;

	public LinkedListNode() {
	}

	public LinkedListNode(Integer newData) {
		data = newData;
	}

	public <T extends LinkedListNode> void addToHead(T newNode) {
		newNode.next = this.next;
		this.next = newNode;
	}

	// Define an iterator for the LinkedList

	public LinkedListIterator iterator() {
		return new LinkedListIterator(this);
	}

	private static class LinkedListIterator implements Iterator {
		private LinkedListNode current = null;

		LinkedListIterator(LinkedListNode listHead) {
			current = listHead.next; // The first node in the linked list is dummy.
		}

		public boolean hasNext() {
			return (current != null);
		}

		public Integer next() {
			Integer returnValue = current.data;
			current = current.next;
			return returnValue;
		}

		public void remove() {
			// Not implemented
		}
	}

	public void print() {
		LinkedListIterator iter = this.iterator();

		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}

	public void addRandomList(int num) {
		Random random = new Random();
		int numLinks = num;

		int i = 0;
		while (i < numLinks) {
			this.addToHead(new LinkedListNode(random.nextInt(100)));
			i++;
		}
	}
}