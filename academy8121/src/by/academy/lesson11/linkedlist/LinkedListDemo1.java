package by.academy.lesson11.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	public static void main(String... args) {

		LinkedList<Integer> list = new LinkedList<>(List.of(1, 5, 2, 3, 5, 7));
		System.out.println(list);

		Iterator<Integer> iterator = list.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			if (i % 2 == 1) {
				list.add(3);
			} else {
				System.out.println(iterator.next());
			}
		}
	}
}
