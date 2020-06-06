package by.academy.lesson20.copyonwritearrayset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
	List<User> list;
	CopyOnWriteArraySet<User> cowSet;

	public static void main(String args[]) {
		new CopyOnWriteArraySetExample();
	}

	public CopyOnWriteArraySetExample() {
		list = new ArrayList<User>();
		list.add(new User("John"));
		list.add(new User("Fred"));
		list.add(new User("Tom"));

		cowSet = new CopyOnWriteArraySet<User>(list);

		System.out.println("Loop with changes");

		Iterator<User> itr = cowSet.iterator();
		int cnt = 0;
		while (itr.hasNext()) {
			User user = itr.next();
			System.out.println("  " + user.name);
			if (++cnt == 1) {
				cowSet.add(new User(""));
				user.name += " Doe";
			}
		}

		System.out.println("\nLoop without changes");
		itr = cowSet.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			System.out.println("  " + user.name);
		}
	}

	class User {
		private String name;

		public User(String name) {
			this.name = name;
		}
	}

}
