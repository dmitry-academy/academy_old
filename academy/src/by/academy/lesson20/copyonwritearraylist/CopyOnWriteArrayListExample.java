package by.academy.lesson20.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	List<String> list;

	public CopyOnWriteArrayListExample() {
		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("J2EE");
		lst.add("J2SE");
		lst.add("Collection");
		lst.add("Concurrent");
		list = lst;
//		printCollection(true);
//		list = new CopyOnWriteArrayList<String>(lst);
		System.out.println("\nLoop without changes");
		printCollection(false);
		System.out.println("Loop with changes");
		printCollection(true);

	}

	private void printCollection(boolean change) {
//		Iterator<String> iterator = list.iterator();
//		int counter = 0;

		for (int i = 0; i < list.size(); i++) {
			if (change && i == 2) {
				list.remove(i);
			}
			System.out.println(list.get(i));
		}
//		while (iterator.hasNext()) {
//			String element = iterator.next();
//			System.out.printf("  %s %n", element);
////			if (change && counter == 2) {
////				list.remove(element);
////			}
////			counter++;
//			if (change) {
//				if (element.equals("Collection")) {
//					list.add("New string");
//					list.remove(element);
//				}
//			}
//		}
	}

	public static void main(String args[]) {
		new CopyOnWriteArrayListExample();
		System.exit(0);
	}
}
