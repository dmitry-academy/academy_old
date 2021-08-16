package by.academy.lesson10.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});

		treeSet.add(1);
		treeSet.add(123);
		treeSet.add(432);
		treeSet.add(12);
		treeSet.add(32);
		treeSet.add(12);
		treeSet.add(32);
		treeSet.add(12);
		treeSet.add(32);

		System.out.println(treeSet);

		Integer a = 5;
		Integer b = 10;

		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(b.compareTo(b));

		Set<String> s = new TreeSet<>();

		s.add("z");
		s.add("Z");

		s.add("харьков");
		s.add("Харьков");
		s.add("Киев");
		s.add("Львов");
		s.add("Кременчуг");
		s.add("Харьков");

		System.out.println(s);

	}
}
