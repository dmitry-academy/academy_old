package by.academy.lesson10.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		System.out.println("Начальный размер arrayList: " + arrayList.size());

		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("A");

		System.out.println(arrayList.contains("A"));
		arrayList.set(2, "C2");
		arrayList.add(1, "A2");

		System.out.println("Удален элемент: " + arrayList.remove(1));

		System.out.println("Последний индекс элемента: " + arrayList.indexOf("F"));

		System.out.println(arrayList.subList(arrayList.indexOf("F"), arrayList.lastIndexOf("F")));
//		System.out.println("НЕ Начальный размер arrayList: " + arrayList.size());

		System.out.println("Размер arrayList после добавления: " + arrayList.size());
		System.out.println("Содержимое arrayList: " + arrayList);
//		System.out.println(arrayList.get(0));

	}
}