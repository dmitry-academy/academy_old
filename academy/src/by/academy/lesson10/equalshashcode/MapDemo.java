package by.academy.lesson10.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String... args) {
		Map<User, Integer> test = new HashMap<>();
		User u = new User(10000);
		test.put(u, 1000);
		for (int i = 0; i < 100; i++) {
			test.put(new User(i), i);
		}
		test.remove(u);
		System.out.println(test.size());
	}
}
