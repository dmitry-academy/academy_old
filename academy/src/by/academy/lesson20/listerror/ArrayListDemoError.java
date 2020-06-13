package by.academy.lesson20.listerror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemoError {
	public static void main(String... args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		Iterator<Integer> iterator = integers.iterator();
//		while (iterator.hasNext()) {
//			Integer i = iterator.next();
//			if (i == 3) {
//				integers.set(2, 2);
//			}
//			
//			System.out.println(i);
//		}

		for (int i = 0; i < integers.size(); i++) {
			integers.add(1);
		}

//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			Integer value = it.next();
//			System.out.println("List Value:" + value);
//			if (value.equals(3))
//				list.remove(value);
//		}
	}
}
