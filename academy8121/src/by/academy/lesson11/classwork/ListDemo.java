package by.academy.lesson11.classwork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] arg) {
		ArrayList<Integer> intArrayList = new ArrayList<>();
		LinkedList<Integer> intLinkedList = new LinkedList<>();

		intLinkedList.add(9);
		intLinkedList.add(9);
		intLinkedList.add(9);
		intLinkedList.add(9);

		intArrayList.add(1);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(1);

		intArrayList.addAll(2, intLinkedList);

		intArrayList.set(7, 777);

//		Iterator<Integer> iterator = intArrayList.listIterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		intArrayList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		System.out.println(intArrayList.subList(0, 3));

		System.out.println(intArrayList.lastIndexOf(9));

		for (Integer i : intArrayList) {
			System.out.print(i + " ");
		}
	}
}
