package by.academy.lesson12;

public class LinkedListNodeDemo {
	public static void main(String... args) {
		LinkedListNode node = new LinkedListNode();
		node.addRandomList(10);
		node.print();
		removeDuplicates(node);
		node.print();
	}

	public static void removeDuplicates(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			/* Удаление всех последующих узлов с тем же значением */
			
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			
			current = current.next;
		}
	}
}
