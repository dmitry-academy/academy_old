package by.academy.lesson10.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		
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
	}
}
