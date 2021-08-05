package by.academy.lesson11.set;

import java.util.Comparator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
//[Гродно, Брест, Могилев, Гомель, Минск, Минск]
//[Гродно, Могилев, Гомель, Минск, Минск, Брест]
//[Минск, Гомель, Брест, Минск, Могилев, Гродно]

public class TreeSetDemo2 {
	public static void main(String[] args) {
		SortedSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
			int i = 0;

			@Override
			public int compare(String o1, String o2) {
				System.out.println("compare" + i);
				return i--;
			}
		});

		treeSet.add("Минск");
		treeSet.add("Брест");
		treeSet.add("Могилев");
		treeSet.add("Гродно");
		treeSet.add("Гомель");
		treeSet.add("Минск");

		System.out.println(treeSet);

//		SortedSet<String> subSet = treeSet.subSet("Минск", "Могилев");
//		System.out.println("SubSet: " + subSet);
//
//		System.out.println("HeadSet: " + treeSet.headSet("Минск"));
//		System.out.println("TailSet: " + treeSet.tailSet("Минск"));
//		System.out.println("Первый элемент: " + treeSet.first());
//		System.out.println("Последний элемент: " + treeSet.last());
	}
}