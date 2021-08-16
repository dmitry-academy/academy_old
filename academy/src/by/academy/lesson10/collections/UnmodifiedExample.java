package by.academy.lesson10.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnmodifiedExample {

	public static void main(String... args) {
		List<String> unmodifiedStrings = List.of("one", "two", "three");
		System.out.println(unmodifiedStrings);
	
		List<String> modifiedStrings = new ArrayList<>(unmodifiedStrings);
		modifiedStrings.add("asd");
		
		List<Integer> unmodifiedInts = List.of(1, 2, 3);
		System.out.println(unmodifiedInts);
		
		Map<Integer, String> integerStringMap = Map.of(1, "one", 2, "two", 3, "three");
		System.out.println(integerStringMap);
	}

}
