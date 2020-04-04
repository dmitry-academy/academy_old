package by.academy.lesson3.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOperations {
	public static void main(String... args) {
//		String first = "hello";
//		String second = "hllue";
//
//		byte[] result = new byte[256];
//		boolean f = true;
//
//		for (char c : first.toCharArray()) {
//			result[c]++;
//		}
//
//		for (char c : second.toCharArray()) {
//			result[c]--;
//		}
//
//		for (byte b : result) {
//			if (b != 0) {
//				System.out.println("Strings not permutated");
//				f = false;
//				break;
//			}
//		}
//		if (f) {
//			System.out.println("string perm");
//		}

		List<String> list1 = new ArrayList<>();
		list1.add("test");
		list1.add("test2");
		list1.add("test3");

		List<String> list2 = new ArrayList<>();
		list2.add("te1st");
		list2.add("test2");
		list2.add("test3");

		Map<String, Integer> map = new HashMap<>();

		for (String s : list1) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}

		for (String s : list2) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) - 1);
			} else {
				map.put(s, -1);
			}
		}

		for (Integer i : map.values()) {
			if (i != 0) {
				System.out.println("POPALSIA");
			}
		}

	}
}
