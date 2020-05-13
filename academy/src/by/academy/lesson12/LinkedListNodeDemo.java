package by.academy.lesson12;

public class LinkedListNodeDemo {
	public static void main(String... args) {
		LinkedListNode node = new LinkedListNode(5);
		node.addRandomList(10);
		node.print();
		node.removeDuplicates();
	}
}
