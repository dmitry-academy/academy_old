package by.academy.lesson11.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import by.academy.lesson11.set.WrongHashCat;

public class HashMapDemo {
	public static void main(String[] args) {
		WrongHashCat cat1 = new WrongHashCat("вася");
		WrongHashCat cat2 = new WrongHashCat("барсик");
		WrongHashCat cat3 = new WrongHashCat("платон");
		WrongHashCat cat4 = new WrongHashCat("кузя");
		WrongHashCat cat5 = new WrongHashCat("вася");
		WrongHashCat cat6 = new WrongHashCat("вася");

		Map<WrongHashCat, Integer> hashMap = new HashMap<>();

		hashMap.put(cat1, 1);
		hashMap.put(cat2, 2);
		hashMap.put(cat3, 3);
		hashMap.put(cat4, 4);

//		hashMap.put("Иванов2", 1.0);
//		hashMap.put("Петров", 123.22);
//		hashMap.put("Сидоров", 1378.00);

		Set<WrongHashCat> keys = hashMap.keySet();

		for (WrongHashCat key : keys) {
			System.out.print(key + ": ");
			System.out.println(hashMap.get(key));
		}

	}
}